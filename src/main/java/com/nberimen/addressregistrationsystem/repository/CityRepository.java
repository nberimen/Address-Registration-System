package com.nberimen.addressregistrationsystem.repository;

import com.nberimen.addressregistrationsystem.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    City findByPlateCode(String plateCode);
}
