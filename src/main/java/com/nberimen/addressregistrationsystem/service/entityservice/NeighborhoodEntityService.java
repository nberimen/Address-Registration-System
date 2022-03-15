package com.nberimen.addressregistrationsystem.service.entityservice;

import com.nberimen.addressregistrationsystem.entity.Neighborhood;
import com.nberimen.addressregistrationsystem.repository.NeighborhoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NeighborhoodEntityService {

    private final NeighborhoodRepository neighborhoodRepository;

    public Neighborhood save(Neighborhood neighborhood) {
        return neighborhoodRepository.save(neighborhood);
    }

    public Neighborhood updateNeighborhoodName(Long id, String name) {
        Optional<Neighborhood> neighborhoodOptional = neighborhoodRepository.findById(id);

        Neighborhood neighborhood;
        if (neighborhoodOptional.isPresent()) {
            neighborhood = neighborhoodOptional.get();
        } else {
            throw new RuntimeException("Item not found");
        }
        neighborhood.setName(name);

        return neighborhoodRepository.save(neighborhood);
    }

    public List<Neighborhood> findAllByDistrictId(Long districtId) {
        return neighborhoodRepository.findAllByDistrictId(districtId);
    }
}
