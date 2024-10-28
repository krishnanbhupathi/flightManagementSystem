package com.krishna.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
