package com.example.demo.modelo;

import javax.persistence.*;

@Entity
@Table (name = "Buy")
public class buy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn (name = "id_client")
    private client c;
    @ManyToOne
    @JoinColumn (name = "id_produtct")
    private product pr;

    public buy(client c, product pr) {
        this.c = c;
        this.pr = pr;
    }

    public buy() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public client getC() {
        return c;
    }

    public void setC(client c) {
        this.c = c;
    }

    public product getPr() {
        return pr;
    }

    public void setPr(product pr) {
        this.pr = pr;
    }
}

