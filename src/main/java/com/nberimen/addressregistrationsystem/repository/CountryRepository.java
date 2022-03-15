package com.nberimen.addressregistrationsystem.repository;

import com.nberimen.addressregistrationsystem.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findByCode(String code);
}
