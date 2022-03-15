package com.nberimen.addressregistrationsystem.service.entityservice;

import com.nberimen.addressregistrationsystem.entity.District;
import com.nberimen.addressregistrationsystem.repository.DistrictRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictEntityService {

    private final DistrictRepository districtRepository;

    public District save(District district) {
        return districtRepository.save(district);
    }

    public List<District> findAllByCityId(Long id) {
        return districtRepository.findAllByCityId(id);
    }

}
