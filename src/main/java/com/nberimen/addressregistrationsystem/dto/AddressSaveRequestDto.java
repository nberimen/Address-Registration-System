package com.nberimen.addressregistrationsystem.dto;

import lombok.Data;

@Data
public class AddressSaveRequestDto {

    private Long streetId;
    private String doorNumber;
    private String apartmentNumber;
}
