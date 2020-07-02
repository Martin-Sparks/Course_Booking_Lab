package com.example.codeclan.Course.Booking.System.repositories;

import com.example.codeclan.Course.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
