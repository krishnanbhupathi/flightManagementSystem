package com.krishna.flightcheckin.integration;

import com.krishna.flightcheckin.integration.dto.Reservation;
import com.krishna.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}
