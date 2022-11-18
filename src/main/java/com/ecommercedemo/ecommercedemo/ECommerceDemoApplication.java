package com.ecommercedemo.ecommercedemo;

import com.ecommercedemo.ecommercedemo.entities.User;
import com.ecommercedemo.ecommercedemo.entities.UserAddress;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ECommerceDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .userName("ersin")
                .firstName("ersin")
                .lastName("ssss")
                .build();


        List<UserAddress> userAddresses =new ArrayList<>();
        userAddresses.add(UserAddress.builder()
                .mobile("1231233213")
                .country("TR")
                .addressLine2("beykoz")
                .addressLine1("IST")
                .build());
    }


}
