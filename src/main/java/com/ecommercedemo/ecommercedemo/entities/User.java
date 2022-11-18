package com.ecommercedemo.ecommercedemo.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @SequenceGenerator(name = "user_seq", initialValue = 1000, allocationSize = 5)
    @GeneratedValue(generator = "user_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private Integer userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String telephone;

    @OneToOne(mappedBy = "user")
    private OrderDetails orderDetails;
    @OneToMany(mappedBy = "user")
    private List<UserAddress> userAddress;
}
