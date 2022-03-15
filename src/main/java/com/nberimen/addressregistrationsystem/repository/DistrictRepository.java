package com.nberimen.addressregistrationsystem.repository;

import com.nberimen.addressregistrationsystem.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

    List<District> findAllByCityId(Long id);
}
