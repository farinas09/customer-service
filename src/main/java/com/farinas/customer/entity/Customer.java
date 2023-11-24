package com.farinas.customer.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Customer")
public class Customer extends Person {
    private String password;
    private Boolean status;

    // Getters y setters

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
