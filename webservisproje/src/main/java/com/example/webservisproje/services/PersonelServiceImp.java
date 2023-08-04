package com.example.webservisproje.services;

import com.example.webservisproje.repo.PersonelDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonelServiceImp implements PersonelService{
@Autowired
    private PersonelDbRepo personelDbRepo;
    @Override
    public Boolean personelBul(String personelMail, String personelTckn) {
        boolean mailDonenDeger= personelDbRepo.existsByPersonelmail(personelMail);
        boolean tcknDonenDeger= personelDbRepo.existsByPersonelTckn(personelTckn);
        if (mailDonenDeger && tcknDonenDeger){
            return true;
        }return false;
    }
}
