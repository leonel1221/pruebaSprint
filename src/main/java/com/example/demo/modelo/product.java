package com.example.demo.modelo;

import javax.persistence.*;

@Entity
@Table(name= "product")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private int price;
    @Column
    private int cant;
    @ManyToOne
    @JoinColumn (name = "id_producer")
    private producer p;

    public product() {

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public producer getP() {
        return p;
    }

    public void setP(producer p) {
        this.p = p;
    }

    public product(String name, int price, int cant, producer p) {
        this.name = name;
        this.price = price;
        this.cant = cant;
        this.p = p;
    }
}
