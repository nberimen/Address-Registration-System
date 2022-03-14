package com.nberimen.addressregistrationsystem.repository;

import com.nberimen.addressregistrationsystem.entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Long> {
}
