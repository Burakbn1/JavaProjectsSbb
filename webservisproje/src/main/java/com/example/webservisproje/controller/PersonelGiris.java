package com.example.webservisproje.controller;

import com.example.webservisproje.repo.PersonelDbRepo;
import com.example.webservisproje.services.PersonelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PersonelGiris {
    private final PersonelDbRepo personelDbRepo;

    private final PersonelService personelService;

    public PersonelGiris(PersonelDbRepo personelDbRepo, PersonelService personelService) {
        this.personelDbRepo = personelDbRepo;
        this.personelService = personelService;
    }
    @GetMapping("/personelgiris")
    public ResponseEntity<String> personelSorgulama(@RequestBody Map<String, String> requestMap) throws Exception{

        String personelMail = requestMap.get("personelMail");
        String personelTckn = requestMap.get("personelTckn");

        Boolean isRealPersonel= personelService.personelBul(personelMail, personelTckn);
        if(isRealPersonel){
            return ResponseEntity.ok("Personel Bulundu");
        }return ResponseEntity.badRequest().body("Personel Bulunamadı");
    }

    /*@GetMapping("/personelSorgula")
    public PersonelDbEntity personelAra(@PathVariable("name") @RequestBody PersonelDbEntity personelDbEntity String ad){
                return personelService.personelBul(personelDbEntity.getPersonelMail(), personelDbEntity.getPersonelTckn());
    }*/
}
