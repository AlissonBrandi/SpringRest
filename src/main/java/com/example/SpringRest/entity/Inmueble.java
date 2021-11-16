package com.example.SpringRest.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inmueble {

    private int codigo;
    private String domicilio;
    private float importe;

    public Inmueble(int codigo, String domicilio, float importe) {
        this.codigo = codigo;
        this.domicilio = domicilio;
        this.importe = importe;
    }
}
