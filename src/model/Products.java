package model;

import java.util.Objects;

public class Products {
    private String name;
    private String description;
    private Double price;
    private Integer quantity;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        if ( Objects.isNull(price)) {
            throw new RuntimeException("Input product price");
        }
        
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        if (Objects.isNull(quantity)) {
            throw new RuntimeException("Input products quantity!");
        }
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }
    
    public Products(String name, Double price, Integer quantity) {
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
    }
}
