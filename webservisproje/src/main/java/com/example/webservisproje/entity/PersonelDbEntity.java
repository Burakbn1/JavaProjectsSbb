package com.example.webservisproje.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "personel_db")
public class PersonelDbEntity {
    @Id
    @Column(name = "personel_id")
    private int personelId;
    @Column(name = "personel_adi")
    private String personelAdi;
    @Column(name = "personel_soyadi")
    private String personelSoyadi;
    @Column(name = "personel_tckn")
    private String personelTckn;
    @Column(name = "personel_dogum_yili")
    private int personelDogumYili;
    @Column(name = "personel_adress")
    private String personelAdress;
    @Column(name = "personel_pozisyon")
    private String personelPozisyon;
    @Column(name = "personel_telefon")
    private String personelTelefon;
    @Column(name = "personel_mail")
    private String personelmail;

}
