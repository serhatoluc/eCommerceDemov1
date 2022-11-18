package com.ecommercedemo.ecommercedemo.sevices;

import com.ecommercedemo.ecommercedemo.entities.User;

public interface IUserService {
    User createUser(User user);

    User getUserById(Integer id);

    User addressMatch(Integer userId, Integer addressId);
}
