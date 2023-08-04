package com.example.webservisproje.repo;

import com.example.webservisproje.entity.MusteriDbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusteriDbRepo extends JpaRepository<MusteriDbEntity, Integer> {
}
