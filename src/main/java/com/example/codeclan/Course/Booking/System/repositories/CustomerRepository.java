package com.example.codeclan.Course.Booking.System.repositories;

import com.example.codeclan.Course.Booking.System.models.Course;
import com.example.codeclan.Course.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public List<Customer> findByName(String name);
    public List<Customer> findAllByBookingsCourseId(Long courseId);

}



