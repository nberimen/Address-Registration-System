package com.nberimen.addressregistrationsystem.service.entityservice;

import com.nberimen.addressregistrationsystem.converter.AddressMapper;
import com.nberimen.addressregistrationsystem.dto.AddressDetailDto;
import com.nberimen.addressregistrationsystem.dto.AddressResponseDto;
import com.nberimen.addressregistrationsystem.dto.AddressSaveRequestDto;
import com.nberimen.addressregistrationsystem.entity.Address;
import com.nberimen.addressregistrationsystem.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressEntityService {

    private final AddressRepository addressRepository;

    public AddressResponseDto save(AddressSaveRequestDto addressSaveRequestDto) {
        Address address = AddressMapper.INSTANCE.convertToAddress(addressSaveRequestDto);
        address = addressRepository.save(address);

        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }

    public void delete(Long id) {
        Optional<Address> addressOptional = addressRepository.findById(id);

        Address address;
        if (addressOptional.isPresent()) {
            address = addressOptional.get();
        } else {
            throw new RuntimeException("Item not found");
        }

        addressRepository.delete(address);
    }

    public AddressResponseDto findById(Long id) {
        Optional<Address> addressOptional = addressRepository.findById(id);

        Address address;
        if (addressOptional.isPresent()) {
            address = addressOptional.get();
        } else {
            throw new RuntimeException("Item not found");
        }
        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);
        return addressResponseDto;
    }

    public AddressDetailDto findAddressDetails(Long id) {
        return addressRepository.findAddressDetails(id);
    }
}
