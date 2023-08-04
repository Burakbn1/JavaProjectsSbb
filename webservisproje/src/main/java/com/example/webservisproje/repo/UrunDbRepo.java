package com.example.webservisproje.repo;

import com.example.webservisproje.entity.UrunDbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrunDbRepo extends JpaRepository<UrunDbEntity, Integer> {
}
