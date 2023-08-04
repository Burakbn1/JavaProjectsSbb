package com.example.webservisproje.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "musteri_db")
public class MusteriDbEntity {
    @Id
    private int musteri_id;
    private String musteri_adi;
    private String musteri_soyadi;
    private String musteri_tckn;
    private int musteri_dogum_yili;
    private String musteri_adress;
    private String musteri_telefon;
    private String musteri_mail;

}
