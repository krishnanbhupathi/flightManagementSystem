package com.krishna.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
