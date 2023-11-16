package model;

import java.security.KeyStore.LoadStoreParameter;
import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {
    private LocalDateTime date = LocalDateTime.now();
    private Double totalAmount;
    private String status;
    private Users users;

    public LocalDateTime getDate() {
        return date;
    }
    public void setDate() {
        this.date = LocalDateTime.now();
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public Double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Double totalAmount) {
        if (totalAmount < 0) {
            throw new RuntimeException("Total amount must be a positive number!");
        }
        this.totalAmount = totalAmount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Users getUsers() {
        return users;
    }
    public void setUsers(Users users) {
        if (Objects.isNull(users)) {
            throw new RuntimeException("Users is required!");
        }
        this.users = users;
    }

    public Transaction() {

    }

    public Transaction(Double totalAmount, Users users){
        this.setTotalAmount(totalAmount);
        this.setUsers(users);
    }

    @Override
    public String toString() {
        return "Transaction [date=" + date + ", totalAmount=" + totalAmount + ", status=" + status + ", users=" + users
                + "]";
    }
    
}
