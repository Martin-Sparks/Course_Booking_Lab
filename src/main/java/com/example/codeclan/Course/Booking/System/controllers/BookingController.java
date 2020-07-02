package com.example.codeclan.Course.Booking.System.controllers;


import com.example.codeclan.Course.Booking.System.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;
}
