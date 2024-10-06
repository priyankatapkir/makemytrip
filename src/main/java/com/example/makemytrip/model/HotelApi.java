package com.example.makemytrip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelApi {

    @JsonProperty("Hotel Name")
    private String hotelName;

    @JsonProperty("Hotel Address")
    private String hotelAddress;

    public HotelApi(String hotelName, String hotelAddress) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
    }
}
