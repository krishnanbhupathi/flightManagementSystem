package com.krishna.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
