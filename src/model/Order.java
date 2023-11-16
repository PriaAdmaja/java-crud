package model;

public class Order {
    private Transaction transaction;
    private Products products;
    private Integer quantity;
    private Double price;

    public Transaction getTransaction() {
        return transaction;
    }
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
    public Products getProducts() {
        return products;
    }
    public void setProducts(Products products) {
        this.products = products;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public Order() {

    }

    public Order(Transaction transaction, Products products, Integer quantity, Double price) {
        setTransaction(transaction);
        setProducts(products);
        setQuantity(quantity);
        setPrice(price);
    }
    @Override
    public String toString() {
        return "Order [transaction=" + transaction + ", products=" + products + ", quantity=" + quantity + ", price="
                + price + "]";
    }

    
    
}