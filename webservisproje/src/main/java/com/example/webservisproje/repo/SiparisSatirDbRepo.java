package com.example.webservisproje.repo;

import com.example.webservisproje.entity.SiparisSatirDbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiparisSatirDbRepo extends JpaRepository<SiparisSatirDbEntity, Integer> {
}
