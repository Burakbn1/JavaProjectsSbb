package com.example.webservisproje.controller;

import com.example.webservisproje.mernis.UQQKPSPublicSoap;


public class MernisKontrolClass {

    UQQKPSPublicSoap client = new UQQKPSPublicSoap();
    public Boolean mernisKontrolMeth(String gelen_tckn,String gelen_Ad,String gelen_Soyad,int gelen_dogum_yili){
        boolean isRealPerson;
        {
            try {
                isRealPerson = client.TCKimlikNoDogrula(Long.valueOf(gelen_tckn), gelen_Ad, gelen_Soyad, gelen_dogum_yili);
                if (isRealPerson) return true;
                else return false;

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
