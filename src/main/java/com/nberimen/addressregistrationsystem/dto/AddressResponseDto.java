package com.nberimen.addressregistrationsystem.dto;

import lombok.Data;

@Data
public class AddressResponseDto {

    private Long id;
    private Long streetId;
    private String doorNumber;
    private String apartmentNumber;
}
