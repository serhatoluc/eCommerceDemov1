package com.ecommercedemo.ecommercedemo.entities;

import lombok.*;

import javax.persistence.*;
@Builder
@Entity
@Table(name = "user_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress {

    @Id
    @SequenceGenerator(name = "address_seq",allocationSize = 25, initialValue = 25)
    @GeneratedValue(generator = "address_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "address_id")
    private Integer addressId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String postalCode;
    private String country;
    private String telephone;
    private String mobile;

    @ManyToOne
    private User user;
}
