package com.codecool.java.ee.dojo;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table(name="jpa_order_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;
    private double price;

public Product(){}

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

        public double getPrice() {
        return price;
    };

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return description;
    }
}
