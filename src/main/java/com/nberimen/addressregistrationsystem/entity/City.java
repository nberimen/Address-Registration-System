package com.nberimen.addressregistrationsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "CITY")
@Getter
@Setter
public class City {

    @Id
    @SequenceGenerator(name = "City", sequenceName = "CITY_ID_SEQ")
    @GeneratedValue(generator = "City")
    private Long id;

    @Column(name = "ID_COUNTRY")
    private Long countryId;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "PLATE_CODE", length = 5, nullable = false)
    private String plateCode;
}
