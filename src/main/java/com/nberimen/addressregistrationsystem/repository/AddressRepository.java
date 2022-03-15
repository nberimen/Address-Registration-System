package com.nberimen.addressregistrationsystem.repository;

import com.nberimen.addressregistrationsystem.dto.AddressDetailDto;
import com.nberimen.addressregistrationsystem.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query(
            "select new com.nberimen.addressregistrationsystem.dto.AddressDetailDto(" +
                    "country.name, city.name, district.name, nb.name, street.name" +
                    ")" +
                    "from Address adr left join Street street on adr.streetId = street.id " +
                    "left join Neighborhood nb on nb.id = street.neighborhoodId " +
                    "left join District district on district.id = nb.districtId " +
                    "left join City city on city.id = district.cityId " +
                    "left join Country country on country.id = city.countryId " +
                    "where adr.id = :id "
    )
    AddressDetailDto findAddressDetails(@Param("id") Long id);
}
