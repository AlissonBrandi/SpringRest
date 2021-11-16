package com.example.SpringRest.service;

import com.example.SpringRest.entity.Cliente;
import com.example.SpringRest.entity.Cobranza;
import com.example.SpringRest.entity.Inmueble;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SistemaService {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Inmueble> inmuebles = new ArrayList<>();
    private List<Cobranza> cobranzas = new ArrayList<>();


    //CLIENTES

    public void addCliente(Cliente cliente) {

        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String dni) {
        for (Cliente c : clientes) {

            if (dni.equals(c.getDni())) {
                return c;
            }
        }
        return null;
    }

    public Boolean buscarClienteBoolean(String dni) {
        for (Cliente c : clientes) {

            if (dni.equals(c.getDni())) {
                return true;
            }
        }
        return false;
    }

    public void removeCliente(String dni) {
        Optional<Cliente> optionalCliente = Optional.ofNullable(buscarCliente(dni));
        clientes.remove(optionalCliente.get());

    }

    public void updateCliente(Cliente cliente) {
        removeCliente(cliente.getDni());
        clientes.add(cliente);
    }

    //INMUEBLES

    public void addInmueble(Inmueble inmueble) {

        inmuebles.add(inmueble);
    }

    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public Inmueble buscarInmueble(int codigo) {
        for (Inmueble i : inmuebles) {

            if (codigo == i.getCodigo()) {
                return i;
            }
        }
        return null;
    }

    public Boolean buscarInmuebleBoolean(int codigo) {
        for (Inmueble i : inmuebles) {

            if (codigo == i.getCodigo()) {
                return true;
            }
        }
        return false;
    }

    public void removeInmueble(int codigo) {
        Optional<Inmueble> optionalInmueble = Optional.ofNullable(buscarInmueble(codigo));
        inmuebles.remove(optionalInmueble.get());

    }

    public void updateInmueble(Inmueble inmueble) {
        removeInmueble(inmueble.getCodigo());
        inmuebles.add(inmueble);
    }


    //COBRANZA

    public void addCobranza(Cobranza cobranza) {
        cobranzas.add(cobranza);
    }

    public List<Cobranza> getCobranzas() {
        return cobranzas;
    }

    public Boolean buscarCobranzaBoolean(int numero) {
        for (Cobranza c : cobranzas) {

            if (numero == c.getNumero()) {
                return true;
            }
        }
        return false;
    }

    //COBRANZAS POR CLIENTE.



    //COBRANZAS POR INMUEBLE.


}
