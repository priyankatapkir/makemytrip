package com.example.makemytrip.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Hotel {

    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="Hotel_code")
    private Long HotelCode;

    @Column(name="Hotel_name")
    private String HotelName;

    @Column(name="Hotel_address")
    private String HotelAddress;

}
