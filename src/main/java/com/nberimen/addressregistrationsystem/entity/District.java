package com.nberimen.addressregistrationsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "DISTRICT")
@Getter
@Setter
public class District {

    @Id
    @GeneratedValue(generator = "District")
    @SequenceGenerator(name = "District", sequenceName = "DISTRICT_ID_SEQ")
    private Long id;

    @Column(name = "ID_CITY")
    private Long cityId;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;
}
