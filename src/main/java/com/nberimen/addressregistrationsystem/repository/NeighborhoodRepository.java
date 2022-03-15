package com.nberimen.addressregistrationsystem.repository;

import com.nberimen.addressregistrationsystem.entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Long> {

    List<Neighborhood> findAllByDistrictId(Long districtId);
}
