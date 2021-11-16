package com.example.SpringRest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cobranza {

    private int numero;
    private String fecha;
    private Cliente cliente;
    private Inmueble inmueble;

    public Cobranza(int numero, String fecha, Cliente cliente, Inmueble inmueble) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.inmueble = inmueble;
    }




    @Override
    public String toString() {
        return "Cobranza{" +
                "numero=" + numero +
                ", fecha='" + fecha + '\'' +
                ", cliente=" + cliente +
                ", inmueble=" + inmueble +
                '}';
    }
}
