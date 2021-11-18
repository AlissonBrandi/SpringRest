package com.example.SpringRest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="Clientes")
public class ClienteDTO {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String dni;
    private String nombre;


}
