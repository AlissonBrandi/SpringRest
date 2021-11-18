package com.example.SpringRest.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="Inmuebles")
public class InmuebleDTO {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private int codigo;
    private String domicilio;
    private float importe;

    public InmuebleDTO(int codigo, String domicilio, float importe) {
        this.codigo = codigo;
        this.domicilio = domicilio;
        this.importe = importe;
    }
}
