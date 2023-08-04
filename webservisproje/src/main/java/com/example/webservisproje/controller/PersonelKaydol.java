package com.example.webservisproje.controller;

import com.example.webservisproje.entity.PersonelDbEntity;
import com.example.webservisproje.repo.PersonelDbRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonelKaydol {
    MernisKontrolClass mernisKontrol=new MernisKontrolClass();
    private final PersonelDbRepo personelDbRepo;

    public PersonelKaydol(PersonelDbRepo personelDbRepo) {
        this.personelDbRepo = personelDbRepo;
    }

    @GetMapping("/personelkaydol")
    public ResponseEntity<String> personelregister(@RequestBody PersonelDbEntity personelDbEntity) throws Exception{
        boolean isRealPerson= mernisKontrol.mernisKontrolMeth(personelDbEntity.getPersonelTckn(), personelDbEntity.getPersonelAdi(), personelDbEntity.getPersonelSoyadi(), personelDbEntity.getPersonelDogumYili());

        if(isRealPerson){
            personelDbRepo.save(personelDbEntity);
            return ResponseEntity.ok("Kullanıcı Başarı ile kaydedildi");
        }return ResponseEntity.badRequest().body("Ekleme İşlemi Başarısız");
    }
}
