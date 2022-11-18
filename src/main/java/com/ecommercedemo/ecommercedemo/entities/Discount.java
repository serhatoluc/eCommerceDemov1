package com.ecommercedemo.ecommercedemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "discount")
@Getter
@Setter
public class Discount {

    @Id
    @SequenceGenerator(name = "discount_seq", initialValue = 1000, allocationSize = 5)
    @GeneratedValue(generator = "discount_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "discount_id")
    private Integer discountId;
    @Column(name = "discount_name")
    private String name;
    @Column(name = "discount_desc", length = 500)
    private String desc;
    @Column(name = "discount_percent")
    private BigDecimal discountPercent;
    @Column(name = "discount_active")
    boolean active;

    @OneToMany(mappedBy = "discount")
    private List<Product> product;
}
