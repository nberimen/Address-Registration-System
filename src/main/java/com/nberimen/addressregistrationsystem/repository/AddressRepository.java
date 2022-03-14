package com.nberimen.addressregistrationsystem.repository;

import com.nberimen.addressregistrationsystem.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
