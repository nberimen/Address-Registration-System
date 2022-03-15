package com.nberimen.addressregistrationsystem.controller;

import com.nberimen.addressregistrationsystem.dto.AddressDetailDto;
import com.nberimen.addressregistrationsystem.dto.AddressResponseDto;
import com.nberimen.addressregistrationsystem.dto.AddressSaveRequestDto;
import com.nberimen.addressregistrationsystem.entity.*;
import com.nberimen.addressregistrationsystem.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/adresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    //------------------------------Country-----------------------------------------
    @PostMapping("/countries")
    public ResponseEntity save(@RequestBody Country country) {
        return ResponseEntity.ok(addressService.saveCuntry(country));
    }

    @GetMapping("/countries/{code}")
    public ResponseEntity findByCountryCode(@PathVariable String code) {
        Country country = addressService.findByCountryCode(code);
        return ResponseEntity.ok(country);
    }


    //------------------------------City--------------------------------------------
    @PostMapping("/cities")
    public ResponseEntity save(@RequestBody City city) {
        city = addressService.saveCity(city);
        return ResponseEntity.ok(city);
    }

    @GetMapping("/cities/{plateCode}")
    public ResponseEntity findByPlateCode(@PathVariable String plateCode) {
        City city = addressService.findByPlateCode(plateCode);
        return ResponseEntity.ok(city);
    }

    //------------------------------District-----------------------------------------
    @PostMapping("/districts")
    public ResponseEntity save(@RequestBody District district) {
        district = addressService.saveDistrict(district);
        return ResponseEntity.ok(district);
    }

    @GetMapping("/districts/{cityId}")
    public ResponseEntity findAllByCityId(@PathVariable Long cityId) {
        List<District> districtList = addressService.findAllByCityId(cityId);
        return ResponseEntity.ok(districtList);
    }

    //------------------------------Neighborhood-----------------------------------------
    @PostMapping("/neighborhoods")
    public ResponseEntity save(@RequestBody Neighborhood neighborhood) {
        neighborhood = addressService.saveNeighborhood(neighborhood);
        return ResponseEntity.ok(neighborhood);
    }

    @PatchMapping("/neighborhoods")
    public ResponseEntity updateNeighborhoodName(@RequestParam Long id, @RequestParam String name) {
        Neighborhood neighborhood = addressService.updateNeighborhoodName(id, name);
        return ResponseEntity.ok(neighborhood);
    }

    @GetMapping("/neighborhoods/{districtId}")
    public ResponseEntity findAllNeighborhoods(@PathVariable Long districtId) {
        List<Neighborhood> neighborhoodList = addressService.findAllNeighborhoods(districtId);
        return ResponseEntity.ok(neighborhoodList);
    }


    //------------------------------Street-----------------------------------------
    @PostMapping("/streets")
    public ResponseEntity save(@RequestBody Street street) {
        street = addressService.saveStreet(street);
        return ResponseEntity.ok(street);
    }

    @PatchMapping("/streets")
    public ResponseEntity updateStreetName(@RequestParam Long id, @RequestParam String name) {
        Street street = addressService.updateStreetName(id, name);
        return ResponseEntity.ok(street);
    }

    @GetMapping("/streets/{neighborhoodId}")
    public ResponseEntity findAllStreets(@PathVariable Long neighborhoodId) {
        List<Street> streetList = addressService.findAllStreets(neighborhoodId);
        return ResponseEntity.ok(streetList);
    }


    //------------------------------Address-----------------------------------------
    @PostMapping
    public ResponseEntity save(@RequestBody AddressSaveRequestDto addressSaveRequestDto) {
        AddressResponseDto addressResponseDto = addressService.saveAddress(addressSaveRequestDto);

        return ResponseEntity.ok(addressResponseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.ok(Void.TYPE);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        AddressResponseDto addressResponseDto = addressService.findAddressById(id);
        return ResponseEntity.ok(addressResponseDto);
    }

    @GetMapping("/details/{id}")
    public ResponseEntity findAddressDetails(@PathVariable Long id) {
        AddressDetailDto addressDetailDto = addressService.findAddressDetailsById(id);
        return ResponseEntity.ok(addressDetailDto);
    }
}
