package com.example.webservisproje.repo;

import com.example.webservisproje.entity.PersonelDbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelDbRepo extends JpaRepository<PersonelDbEntity, Integer> {

    public Boolean existsByPersonelmail(String personelMail);

    public Boolean existsByPersonelTckn(String personelTckn);

}
