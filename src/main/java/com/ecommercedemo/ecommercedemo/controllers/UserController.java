package com.ecommercedemo.ecommercedemo.controllers;

import com.ecommercedemo.ecommercedemo.entities.User;
import com.ecommercedemo.ecommercedemo.sevices.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userController")
public class UserController {

    private final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }


    @PostMapping ("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(iUserService.createUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id){
        return ResponseEntity.ok(iUserService.getUserById(id));
    }

    @PutMapping("/{userId}/{addressId}")
    public ResponseEntity<User> userAddressMatch(@PathVariable Integer userId, @PathVariable Integer addressId){
        return ResponseEntity.ok(iUserService.addressMatch(userId, addressId));
    }
}
