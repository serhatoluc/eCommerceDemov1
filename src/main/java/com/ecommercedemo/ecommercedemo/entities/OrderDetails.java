package com.ecommercedemo.ecommercedemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "order_details")
@Getter
@Setter
public class OrderDetails {

    @Id
    @SequenceGenerator(name = "order_seq",allocationSize = 100,initialValue = 10)
    @GeneratedValue(generator = "order_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "order_details_id")
    private Integer orderDetailsId;
    @Column(name = "total")
    private BigDecimal total;

    @OneToMany(mappedBy = "orderDetails")
    private List<OrderItems> orderItemsList;

    @OneToOne
    private User user;

}
