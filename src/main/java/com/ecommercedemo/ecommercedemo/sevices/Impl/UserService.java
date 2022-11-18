package com.ecommercedemo.ecommercedemo.sevices.Impl;

import com.ecommercedemo.ecommercedemo.entities.User;
import com.ecommercedemo.ecommercedemo.entities.UserAddress;
import com.ecommercedemo.ecommercedemo.repositories.AddressRepository;
import com.ecommercedemo.ecommercedemo.repositories.UserRepository;
import com.ecommercedemo.ecommercedemo.sevices.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;
    private final AddressRepository addressRepository;

    public UserService(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public User createUser(User user) {
        User user1 = new User();
        user1.setUserName(user.getUserName());
        user1.setUserAddress(user.getUserAddress());
        user1.setPassword(user.getPassword());
        user1.setTelephone(user.getTelephone());
        user1.setUserId(user.getUserId());
        user1.setOrderDetails(user.getOrderDetails());
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        userRepository.save(user1);
        return user1;
    }

    @Override
    public User getUserById(Integer id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }

    @Override
    public User addressMatch(Integer userId, Integer addressId) {
        User user = userRepository.findById(userId).orElse(null);
        UserAddress userAddress1 = addressRepository.findById(addressId).orElse(null);

        return user;
    }
}
