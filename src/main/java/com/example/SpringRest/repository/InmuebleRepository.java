package com.example.SpringRest.repository;


import com.example.SpringRest.dto.InmuebleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InmuebleRepository {

    @Autowired
    InmuebleRepositoryDao inmuebleRepositoryDao;

    public void creacionInmueble (InmuebleDTO  inmueble){
        inmuebleRepositoryDao.save(inmueble);
    }


    public List<InmuebleDTO> getInmuebles(){
        return (List<InmuebleDTO>) inmuebleRepositoryDao.findAll();
    }
}
