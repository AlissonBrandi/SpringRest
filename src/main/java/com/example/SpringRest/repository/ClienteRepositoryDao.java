package com.example.SpringRest.repository;

import com.example.SpringRest.dto.ClienteDTO;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepositoryDao extends CrudRepository<ClienteDTO, Integer> {


    @Query(value = "UPDATE clientes SET dni = :dni, nombre = :nombre WHERE id = :id", nativeQuery = true)
    public List<ClienteDTO> updateCliente (String dni, String nombre, Integer id);
/*
    @Modifying(clearAutomatically = true)
    @Query("UPDATE clientes SET dni = :dni, nombre = :nombre WHERE id = :id", nativeQuery = true)
    public void updateCliente(@Param("dni") String dni, @Param("nombre") String nombre, @Param("id") Integer id);

     */

}
