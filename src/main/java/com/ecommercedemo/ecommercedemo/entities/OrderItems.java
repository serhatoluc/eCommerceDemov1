package com.ecommercedemo.ecommercedemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orders_items")
@Getter
@Setter
public class OrderItems {

    @Id
    @SequenceGenerator(name = "order_items_seq",allocationSize = 50, initialValue = 2)
    @GeneratedValue(generator = "order_items_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "order_items_id")
    private Integer orderDetailsId;
    @Column(name = "orders_details_quantity")
    private Integer quantity;

    @ManyToOne
    private OrderDetails orderDetails;

    @OneToOne
    private Product product;
}
