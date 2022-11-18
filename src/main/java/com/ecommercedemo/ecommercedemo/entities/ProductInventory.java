package com.ecommercedemo.ecommercedemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "product_inventory")
@Getter
@Setter
public class ProductInventory {

    @Id
    @SequenceGenerator(name = "pinventory_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "pinventory_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "inventory_id")
    private Integer inventoryId;
    @Column(name = "inventory_quantity")
    private Integer quantity;

    @OneToOne(mappedBy = "productInventory")
    private Product product;
}
