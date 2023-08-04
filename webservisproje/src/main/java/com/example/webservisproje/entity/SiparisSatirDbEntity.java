package com.example.webservisproje.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "siparis_satir_db")
@Entity
public class SiparisSatirDbEntity {
    @Id
    private int siparis_satir_id;
    private int siparis_id;
    private int urun_id;
    private int miktar;
}
