package com.nberimen.addressregistrationsystem.controller;

import com.nberimen.addressregistrationsystem.entity.Country;
import com.nberimen.addressregistrationsystem.service.entityservice.CountryEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/adresses")
@RequiredArgsConstructor
public class AddressController {

    private final CountryEntityService countryEntityService;

    @PostMapping("/countries")
    public ResponseEntity save(@RequestBody Country country) {
        return ResponseEntity.ok(countryEntityService.save(country));
    }

    @GetMapping("/countries/{code}")
    public ResponseEntity findByCountryCode(@PathVariable String code) {
        Country country = countryEntityService.findByCountryCode(code);
        return ResponseEntity.ok(country);
    }

}
