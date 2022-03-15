package com.nberimen.addressregistrationsystem.service.entityservice;

import com.nberimen.addressregistrationsystem.entity.Street;
import com.nberimen.addressregistrationsystem.repository.StreetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreetEntityService {

    private final StreetRepository streetRepository;

    public Street save(Street street) {
        return streetRepository.save(street);
    }

    public Street updateStreetName(Long id, String name) {
        Optional<Street> streetOptional = streetRepository.findById(id);

        Street street;
        if (streetOptional.isPresent()) {
            street = streetOptional.get();
        } else {
            throw new RuntimeException();
        }

        street.setName(name);
        street = streetRepository.save(street);
        return street;
    }

    public List<Street> findAllByNeighborhoodId(Long neighborhoodId) {
        return streetRepository.findAllByNeighborhoodId(neighborhoodId);
    }

}
