package com.nberimen.addressregistrationsystem.repository;

import com.nberimen.addressregistrationsystem.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetRepository extends JpaRepository<Street, Long> {

    List<Street> findAllByNeighborhoodId(Long neighborhoodId);
}
