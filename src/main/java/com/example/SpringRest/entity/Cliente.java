package com.example.SpringRest.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cliente {

    private String dni;
    private String nombre;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

}
