package com.example.makemytrip.service.impl;

import com.example.makemytrip.entity.Hotel;
import com.example.makemytrip.model.HotelApi;
import com.example.makemytrip.repository.HotelRepository;
import com.example.makemytrip.service.IHotelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService {

    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public String addNewHotel(HotelApi input) {

        Hotel entity = new Hotel();
        entity.setHotelName(input.getHotelName());
        entity.setHotelAddress(input.getHotelAddress());
        this.hotelRepository.save(entity);

        return "SUCESS";
    }

    @Override
    public List<HotelApi> getAllHotels() {
        List<HotelApi> apiReponseList = new ArrayList<HotelApi>();
        List<Hotel> databaseHotelList = this.hotelRepository.findAll();
        for(Hotel dbEntry : databaseHotelList){
            HotelApi apiResponce = new HotelApi(dbEntry.getHotelName(),dbEntry.getHotelAddress());
            apiReponseList.add(apiResponce);
        }
        return apiReponseList;
    }
}
