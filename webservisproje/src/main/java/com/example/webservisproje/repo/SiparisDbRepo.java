package com.example.webservisproje.repo;

import com.example.webservisproje.entity.SiparisDbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiparisDbRepo extends JpaRepository<SiparisDbEntity, Integer> {




}
