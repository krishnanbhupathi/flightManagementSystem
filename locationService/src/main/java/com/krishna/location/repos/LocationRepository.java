package com.krishna.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
