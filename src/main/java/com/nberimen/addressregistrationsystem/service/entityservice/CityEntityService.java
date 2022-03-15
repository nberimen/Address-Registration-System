package com.nberimen.addressregistrationsystem.service.entityservice;

import com.nberimen.addressregistrationsystem.entity.City;
import com.nberimen.addressregistrationsystem.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityEntityService {

    private final CityRepository cityRepository;

    public City save(City city) {
        return cityRepository.save(city);
    }

    public City findByPlateCode(String plateCode) {
        return cityRepository.findByPlateCode(plateCode);
    }
}
