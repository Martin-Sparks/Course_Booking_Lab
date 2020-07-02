package com.example.codeclan.Course.Booking.System.repositories;

import com.example.codeclan.Course.Booking.System.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    public List<Course> findByName(String name);

    public List<Course> findByRating(Integer rating);

    public List<Course> findAllByBookingsCustomerId(Long customerId);
}
