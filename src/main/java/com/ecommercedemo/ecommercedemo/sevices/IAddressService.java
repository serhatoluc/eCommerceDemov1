package com.ecommercedemo.ecommercedemo.sevices;

import com.ecommercedemo.ecommercedemo.entities.User;
import com.ecommercedemo.ecommercedemo.entities.UserAddress;
import org.springframework.stereotype.Service;


public interface IAddressService {
    UserAddress createAddress(UserAddress userAddress);

    UserAddress getAddressById(Integer id);
}
