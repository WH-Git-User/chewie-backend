package com.chewie.repositories;

import com.chewie.domain.Booking;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface BookingRepository extends CrudRepository<Booking, Integer> {
    /**
     * Save a given Booking
     * 
     * @param booking must not be null
     * @return the saved booking
     */
    Booking save(Booking booking);

    /**
     * Retrieves a Booking by it's id
     * 
     * @param id must not be null
     * @return the Booking with the given id or empty
     */
    Optional<Booking> findById(Integer id);
}