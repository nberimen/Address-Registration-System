package com.nberimen.addressregistrationsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "STREET")
@Getter
@Setter
public class Street {

    @Id
    @SequenceGenerator(name = "Street", sequenceName = "STREET_ID_SEQ")
    @GeneratedValue(generator = "Street")
    private Long id;

    @Column(name = "ID_NEIGHBORHOOD")
    private Long neighborhoodId;

    @Column(name = "NAME", length = 150, nullable = false)
    private String name;
}
