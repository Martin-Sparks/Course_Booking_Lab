package com.example.codeclan.Course.Booking.System.components;

import com.example.codeclan.Course.Booking.System.models.Booking;
import com.example.codeclan.Course.Booking.System.models.Course;
import com.example.codeclan.Course.Booking.System.models.Customer;
import com.example.codeclan.Course.Booking.System.repositories.BookingRepository;
import com.example.codeclan.Course.Booking.System.repositories.CourseRepository;
import com.example.codeclan.Course.Booking.System.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Martin", "Tranent", 29);
        customerRepository.save(customer1);

        Course course1 = new Course("JavaJavaJava", "London", 5);
        courseRepository.save(course1);

        Booking booking1 = new Booking("20/07/2020", customer1, course1);
        bookingRepository.save(booking1);
    }

}
