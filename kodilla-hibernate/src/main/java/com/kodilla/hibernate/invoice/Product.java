package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="PRODUCTS")
public class Product {
    private int id;
    private String name;
    private List<Item> item = new ArrayList<>();

    public Product(){
    }

    public Product(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID",unique = true)
    public int getId() {
        return id;
    }
    @NotNull
    @Column(name ="NAMES")
    public String getName() {
        return name;
    }
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItem() {
        return item;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
