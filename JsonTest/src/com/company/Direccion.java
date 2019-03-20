package com.company;

import java.io.Serializable;

public class Direccion{
    private String calle;
    private int numero;

    public Direccion(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                '}';
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
