package com.example.SpringRest.dto;

import com.example.SpringRest.entity.Cobranza;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class ClienteDTO {

    private String nombre;
    private String dni;
    private List<Cobranza> cobranzas;

}
