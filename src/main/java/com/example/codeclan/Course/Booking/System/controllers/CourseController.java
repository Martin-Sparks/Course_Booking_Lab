package com.example.codeclan.Course.Booking.System.controllers;

import com.example.codeclan.Course.Booking.System.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public ResponseEntity getAllCoursesAndFilters(
            @RequestParam(required = false, name = "name")String name,
            @RequestParam(required = false, name = "rating")Integer rating
    ){
        if (name != null){
            return new ResponseEntity(courseRepository.findByName(name), HttpStatus.OK);
        }
        if (rating != null){
            return new ResponseEntity(courseRepository.findByRating(rating), HttpStatus.OK);
        }

        return new ResponseEntity(courseRepository.findAll(), HttpStatus.OK);
    }

}
