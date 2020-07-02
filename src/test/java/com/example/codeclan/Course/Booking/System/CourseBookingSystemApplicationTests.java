package com.example.codeclan.Course.Booking.System;

import com.example.codeclan.Course.Booking.System.models.Customer;
import com.example.codeclan.Course.Booking.System.repositories.BookingRepository;
import com.example.codeclan.Course.Booking.System.repositories.CourseRepository;
import com.example.codeclan.Course.Booking.System.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseBookingSystemApplicationTests {

@Autowired
	CustomerRepository customerRepository;

@Autowired
	BookingRepository bookingRepository;

@Autowired
	CourseRepository courseRepository;


	@Test
	void contextLoads() {
	}
//
//	@Test
//	public void canFindCoursebyCustomer(){
//		List<Customer> findCourses = customerRepository.findByBookingsCourseName("JavaJavaJava");
//	}

}