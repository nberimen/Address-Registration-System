package com.nberimen.addressregistrationsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
public class Address {

    @Id
    @SequenceGenerator(name = "Address", sequenceName = "ADDRESS_ID_SEQ")
    @GeneratedValue(generator = "Address")
    private Long id;

    @Column(name = "ID_STREET")
    private Long streetId;

    @Column(name = "DOOR_NUMBER")
    private String doorNumber;

    @Column(name = "APARTMENT_NUMBER")
    private String apartmentNumber;
}
