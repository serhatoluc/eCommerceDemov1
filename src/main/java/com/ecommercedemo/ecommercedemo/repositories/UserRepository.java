package com.ecommercedemo.ecommercedemo.repositories;

import com.ecommercedemo.ecommercedemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
