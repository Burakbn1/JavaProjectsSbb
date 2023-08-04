package com.example.webservisproje.controller;

import com.example.webservisproje.entity.MusteriDbEntity;
import com.example.webservisproje.entity.UrunDbEntity;
import com.example.webservisproje.mernis.UQQKPSPublicSoap;
import com.example.webservisproje.repo.UrunDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrunDbKont {

    private final UrunDbRepo urunDbRepo;

    @Autowired
    public UrunDbKont(UrunDbRepo urunDbRepo) {
        this.urunDbRepo = urunDbRepo;
    }
    @GetMapping("/urunekleme")
    public ResponseEntity<String> urunEkleme(@RequestBody UrunDbEntity urunDbEntity) throws Exception{

            urunDbRepo.save(urunDbEntity);

            return ResponseEntity.ok("Ürün Başarı ile kaydedildi");


    }
}
