package com.nberimen.addressregistrationsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AddressDetailDto {
    private String countryName;
    private String cityName;
    private String districtName;
    private String neighborhoodName;
    private String streetName;
}
