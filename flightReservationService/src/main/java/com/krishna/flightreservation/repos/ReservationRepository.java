package com.krishna.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
