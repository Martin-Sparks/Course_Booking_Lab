package com.example.codeclan.Course.Booking.System.repositories;

import com.example.codeclan.Course.Booking.System.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    public List<Booking> findByDate(String date);

}
