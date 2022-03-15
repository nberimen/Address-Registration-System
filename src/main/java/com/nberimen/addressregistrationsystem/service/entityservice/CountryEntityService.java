package com.nberimen.addressregistrationsystem.service.entityservice;

import com.nberimen.addressregistrationsystem.entity.Country;
import com.nberimen.addressregistrationsystem.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryEntityService {

    private final CountryRepository countryRepository;

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Country save(Country country) {
        return countryRepository.save(country);
    }

    public Country findByCountryCode(String countryCode) {
        return countryRepository.findByCode(countryCode);
    }

}
