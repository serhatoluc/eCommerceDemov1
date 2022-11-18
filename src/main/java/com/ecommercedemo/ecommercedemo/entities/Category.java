package com.ecommercedemo.ecommercedemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {

    @Id
    @SequenceGenerator(name = "category_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "category_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "category_name")
    private String name;
    @Column(name = "category_desc")
    private String desc;

    @OneToMany(mappedBy = "category")
    private List<Product> product;

}
