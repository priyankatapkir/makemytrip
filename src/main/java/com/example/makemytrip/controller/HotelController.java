package com.example.makemytrip.controller;

import com.example.makemytrip.model.HotelApi;
import com.example.makemytrip.service.IHotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotelapi/v1")
public class HotelController {


    private IHotelService hotelService;

    public HotelController(IHotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<HotelApi>> getAllHotels() {
        List<HotelApi> hotels = this.hotelService.getAllHotels();
        return new ResponseEntity<>(hotels,
                HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addHotel(@RequestBody HotelApi input) {
        this.hotelService.addNewHotel(input);
        return ResponseEntity.ok("SUCCESS");
    }


}
