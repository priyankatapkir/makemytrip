package com.example.makemytrip.service;

import com.example.makemytrip.model.HotelApi;

import java.util.List;

public interface IHotelService {

    public String addNewHotel(HotelApi input);
    public List<HotelApi> getAllHotels();

}
