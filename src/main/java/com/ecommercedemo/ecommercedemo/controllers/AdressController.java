package com.ecommercedemo.ecommercedemo.controllers;

import com.ecommercedemo.ecommercedemo.entities.UserAddress;
import com.ecommercedemo.ecommercedemo.sevices.IAddressService;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userAddress")
public class AdressController {

    private final IAddressService iAddressService;

    public AdressController(IAddressService iAddressService) {
        this.iAddressService = iAddressService;
    }

    @PostMapping("/createAddress")
    public ResponseEntity<UserAddress> createAddress(@RequestBody UserAddress userAddress){
        return ResponseEntity.ok(iAddressService.createAddress(userAddress));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAddress> getAddressById(@PathVariable Integer id){
        return ResponseEntity.ok(iAddressService.getAddressById(id));
    }
}
