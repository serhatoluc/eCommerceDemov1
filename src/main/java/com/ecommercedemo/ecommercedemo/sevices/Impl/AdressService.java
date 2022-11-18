package com.ecommercedemo.ecommercedemo.sevices.Impl;

import com.ecommercedemo.ecommercedemo.entities.User;
import com.ecommercedemo.ecommercedemo.entities.UserAddress;
import com.ecommercedemo.ecommercedemo.repositories.AddressRepository;
import com.ecommercedemo.ecommercedemo.sevices.IAddressService;
import org.springframework.stereotype.Service;

@Service
public class AdressService implements IAddressService {
    private final AddressRepository addressRepository;

    public AdressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public UserAddress createAddress(UserAddress userAddress) {
        UserAddress userAddress1 = new UserAddress();
        userAddress1.setAddressId(userAddress.getAddressId());
        userAddress1.setUser(userAddress.getUser());
        userAddress1.setAddressLine1(userAddress.getAddressLine1());
        userAddress1.setAddressLine2(userAddress.getAddressLine2());
        userAddress1.setCity(userAddress.getCity());
        userAddress1.setCountry(userAddress.getCountry());
        userAddress1.setMobile(userAddress.getMobile());
        userAddress1.setTelephone(userAddress.getTelephone());
        userAddress1.setPostalCode(userAddress.getPostalCode());
        addressRepository.save(userAddress1);
        return userAddress1;
    }

    @Override
    public UserAddress getAddressById(Integer id) {
        UserAddress userAddress = addressRepository.findById(id).orElse(null);
        return userAddress;
    }
}
