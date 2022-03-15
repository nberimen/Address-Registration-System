package com.nberimen.addressregistrationsystem.converter;

import com.nberimen.addressregistrationsystem.dto.AddressResponseDto;
import com.nberimen.addressregistrationsystem.dto.AddressSaveRequestDto;
import com.nberimen.addressregistrationsystem.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address convertToAddress(AddressSaveRequestDto addressSaveRequestDto);

    AddressResponseDto convertToAddressResponseDto(Address address);
}
