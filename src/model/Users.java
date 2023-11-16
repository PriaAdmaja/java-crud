package model;

import java.util.Objects;

public class Users {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email == "" || Objects.isNull(email)) {
            throw new RuntimeException("Insert your email!");
        }
        this.email = email;
    }

    public Users() {}

    public Users(String email) {
        this.setEmail(email);
    }
    
}
