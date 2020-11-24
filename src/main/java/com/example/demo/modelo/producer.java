package com.example.demo.modelo;

import javax.persistence.*;

@Entity
@Table (name= "Producer")
public class producer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String address;

    public producer() {

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public producer(String name, String lastname, String phone, String email, String address) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
