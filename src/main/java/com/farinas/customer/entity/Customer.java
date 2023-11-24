package com.farinas.customer.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Customer")
public class Customer extends Person {
    private String password;
    private String status;

    // Getters y setters

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
