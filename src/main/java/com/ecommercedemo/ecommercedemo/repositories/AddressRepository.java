package com.ecommercedemo.ecommercedemo.repositories;

import com.ecommercedemo.ecommercedemo.entities.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<UserAddress, Integer> {
}
