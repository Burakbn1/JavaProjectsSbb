package com.example.webservisproje.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "urun_db")
public class UrunDbEntity {
    @Id
    private int urun_id;
    private String urun_tur;
    private String urun_marka;
    private String urun_model;
    private BigDecimal urun_fiyat;
    private int urun_miktar;
    private int urun_miktar_temp;


}
