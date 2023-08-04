package com.example.webservisproje.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "siparis_db")
public class SiparisDbEntity {
    @Id
    private int siparis_id;
    @Column(name = "musteri_id")
    private int musteri_id;
    private Date siparis_tarihi;

}
