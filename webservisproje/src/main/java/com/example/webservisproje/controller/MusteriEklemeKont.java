package com.example.webservisproje.controller;

import com.example.webservisproje.entity.MusteriDbEntity;
import com.example.webservisproje.repo.MusteriDbRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusteriEklemeKont {

    private final MusteriDbRepo musteriDbRepo;

    public MusteriEklemeKont(MusteriDbRepo musteriDbRepo) {
        this.musteriDbRepo = musteriDbRepo;
    }
    MernisKontrolClass mernisKontrol= new MernisKontrolClass();

    @GetMapping("/kaydol")
    public ResponseEntity<String> musteriEkleme(@RequestBody MusteriDbEntity musteriDbEntity) throws Exception{

        boolean isRealPerson= mernisKontrol.mernisKontrolMeth(musteriDbEntity.getMusteri_tckn(), musteriDbEntity.getMusteri_adi(),musteriDbEntity.getMusteri_soyadi(),musteriDbEntity.getMusteri_dogum_yili());

        if(isRealPerson){
            musteriDbRepo.save(musteriDbEntity);
            return ResponseEntity.ok("Kullanıcı Başarı ile kaydedildi");
        }return ResponseEntity.badRequest().body("Yanlış Kullanıcı bilgileri");

    }
}
