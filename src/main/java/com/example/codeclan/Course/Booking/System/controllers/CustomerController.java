package com.example.codeclan.Course.Booking.System.controllers;

import com.example.codeclan.Course.Booking.System.models.Course;
import com.example.codeclan.Course.Booking.System.repositories.CourseRepository;
import com.example.codeclan.Course.Booking.System.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;
    CourseRepository courseRepository;

    @GetMapping
    public ResponseEntity getAllCustomers(
            @RequestParam(required = false, name = "name") String name
    ) {
        if (name != null) {
            return new ResponseEntity(customerRepository.findByName(name), HttpStatus.OK);
        }

        return new ResponseEntity(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/{id}/courses")
    public ResponseEntity<List<Course>> findCoursesByCustomer (@PathVariable Long id){
        return new ResponseEntity<>(courseRepository.findAllByBookingsCustomerId(id), HttpStatus.OK);
    }
}
