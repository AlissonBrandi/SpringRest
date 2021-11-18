package com.example.SpringRest.repository;


import com.example.SpringRest.dto.InmuebleDTO;
import org.springframework.data.repository.CrudRepository;

public interface InmuebleRepositoryDao extends CrudRepository<InmuebleDTO, Integer> {
}
