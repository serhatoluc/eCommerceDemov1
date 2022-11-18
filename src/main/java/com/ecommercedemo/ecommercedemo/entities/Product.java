package com.ecommercedemo.ecommercedemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {

    @Id
    @SequenceGenerator(name = "product_seq", initialValue = 1000, allocationSize = 2)
    @GeneratedValue(generator = "product_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_desc", length = 500)
    private String desc;  //aciklama
    @Column(name = "product_price", precision = 6, scale = 2)
    private BigDecimal price;
    @Column(name = "product_stock")
    private Integer stock;

    @ManyToOne
    private Category category;
    @OneToOne
    private ProductInventory productInventory;
    @ManyToOne
    private Discount discount;

    @OneToOne(mappedBy = "product")
    private OrderItems orderItems;


}
