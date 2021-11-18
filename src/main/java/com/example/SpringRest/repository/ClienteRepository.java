package com.example.SpringRest.repository;

import com.example.SpringRest.dto.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository {

    @Autowired
    ClienteRepositoryDao clienteRepositoryDao;

    public void creacionCliente (ClienteDTO cliente){
        clienteRepositoryDao.save(cliente);
    }

    public void eliminarCliente(Integer id) {
        clienteRepositoryDao.deleteById(id);
    }

    public void eliminarTodos() {
        clienteRepositoryDao.deleteAll();
    }

    public void modificarCliente(String dni, String nombre, Integer id){
       clienteRepositoryDao.updateCliente(dni,nombre,id);
    }


    public List<ClienteDTO> getClientes(){
        return (List<ClienteDTO>) clienteRepositoryDao.findAll();
    }
}


