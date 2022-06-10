package com.cg.model;

import java.math.BigDecimal;

public class Person {
    private int id;
    private String name;
    private String email;
    private BigDecimal balance;
    private String phone;

    public Person() {
    }

    public Person(int id, String name, String email, BigDecimal balance, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
