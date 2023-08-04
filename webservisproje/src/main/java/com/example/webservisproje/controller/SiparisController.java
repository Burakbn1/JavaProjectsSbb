package com.example.webservisproje.controller;

import com.example.webservisproje.entity.SiparisDbEntity;
import com.example.webservisproje.entity.SiparisSatirDbEntity;
import com.example.webservisproje.repo.SiparisDbRepo;
import com.example.webservisproje.repo.SiparisSatirDbRepo;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SiparisController {

    private SiparisDbRepo siparisDbRepo;
    private SiparisSatirDbRepo siparisSatirDbRepo;

    public SiparisController(SiparisDbRepo siparisDbRepo, SiparisSatirDbRepo siparisSatirDbRepo) {
        this.siparisDbRepo = siparisDbRepo;
        this.siparisSatirDbRepo = siparisSatirDbRepo;
    }



    /*@GetMapping("/siparisver")
    public ResponseEntity<String> siparisEkleme(@RequestBody SiparisDbEntity siparisDbEntity) throws Exception{

            siparisDbRepo.save(siparisDbEntity);
            return ResponseEntity.ok("Sipariş Başarıyla Oluşturuldu.");
    }*/


     @GetMapping("/siparisver")
    public ResponseEntity<String> siparisEkleme(@RequestBody List<JsonNode> jsonDataList) throws Exception{
         SiparisSatirDbEntity siparisSatirDbEntity= new SiparisSatirDbEntity();
         SiparisDbEntity siparisDbEntity= new SiparisDbEntity();

        int numberofProcess;

        int numberOfData = jsonDataList.size();
        for(numberofProcess=0; numberofProcess<numberOfData; numberofProcess++){
            JsonNode jsonNode = jsonDataList.get(numberofProcess);
            String musteriId = jsonNode.get("musteri_id").asText();
            siparisDbEntity.setMusteri_id(Integer.parseInt(musteriId));
            siparisDbRepo.save(siparisDbEntity);

            int siparisNo=siparisDbEntity.getSiparis_id();
            String urunMiktar = jsonNode.get("urun_miktar").asText();
            String urunId = jsonNode.get("urun_id").asText();

            siparisSatirDbEntity.setSiparis_id(siparisNo);
            siparisSatirDbEntity.setMiktar(Integer.parseInt(urunMiktar));
            siparisSatirDbEntity.setUrun_id(Integer.parseInt(urunId));
            siparisSatirDbRepo.save(siparisSatirDbEntity);

        }

        //ResponseEntity<String> responseFromFonksiyon1 = fonksiyon1();

        return ResponseEntity.ok("Sipariş Başarıyla Oluşturuldu.");
}
}
