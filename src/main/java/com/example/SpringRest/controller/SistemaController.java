package com.example.SpringRest.controller;

import com.example.SpringRest.dto.ClienteDTO;
import com.example.SpringRest.dto.InmuebleDTO;
import com.example.SpringRest.service.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SistemaController {


    @Autowired
    private SistemaService service;

    @PostMapping
    public ResponseEntity<ClienteDTO> addClientes(@RequestBody ClienteDTO cliente) {
        System.out.println("Solicitud Realizada");
        service.addCliente(cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/eliminarCliente/{id}")
    public void removeClientes(@PathVariable("id") Integer id) {
        System.out.println("Solicitud Realizada");
        service.removeCliente(id);
    }

    @DeleteMapping("/eliminarTodos")
    public void removeAll() {
        System.out.println("Solicitud Realizada");
        service.removeAll();
    }

    @PutMapping("/modificarCliente/{dni}/{nombre}/{id}")
    public void addClientes(@PathVariable("dni") String dni, @PathVariable("nombre") String nombre,@PathVariable("id") Integer id ){
        System.out.println("Solicitud Realizada");
        service.updateCliente(dni,nombre,id);
    }



    @GetMapping
    public List<ClienteDTO> getClientes(){
        return service.getClientes();
    }


    /*

    @Autowired
    private SistemaService sistemaService;

    @Autowired
    private ModelConfiguration modelConfiguration;

    // CLIENTES

    @PostMapping("/agregarCliente")
    public void addCliente(@RequestBody Cliente cliente) throws CamposVaciosException, ClienteRegistradoException {
        if (cliente.getDni().equals("") || cliente.getNombre().equals("") || cliente.getDni().isEmpty() || cliente.getNombre().isEmpty()) {

            throw new CamposVaciosException();

        } else if (sistemaService.buscarClienteBoolean(cliente.getDni()) == true) {
            throw new ClienteRegistradoException();
        } else {
            sistemaService.addCliente(cliente);
        }

    }

    // CLIENTES

    @GetMapping("/Clientes")
    public List<Cliente> getClientes() {
        return sistemaService.getClientes();
    }

    @DeleteMapping("/deletCliente/{dni}")
    public void removeCliente(@PathVariable("dni") String dni) throws ClienteNoExisteException {
        Optional<Cliente> optionalCliente = Optional.ofNullable(sistemaService.buscarCliente(dni));

        if (optionalCliente.isPresent()) {
            sistemaService.removeCliente(dni);

        } else {
            throw new ClienteNoExisteException();
        }
    }

    @PutMapping("/actualizarCliente")
    public void updateCliente(@RequestBody Cliente cliente) throws CamposVaciosException, ClienteRegistradoException {
        if (cliente.getDni().equals("") || cliente.getNombre().equals("") || cliente.getDni().isEmpty() || cliente.getNombre().isEmpty()) {

            throw new CamposVaciosException();

        } else {
            sistemaService.updateCliente(cliente);
        }
    }

    // INMUEBLES

    @PostMapping("/agregarInmueble")
    public void addCliente(@RequestBody Inmueble inmueble) throws CamposVaciosException, InmuebleRegistradoException {
        if (inmueble.getCodigo() == 0 || inmueble.getDomicilio().equals("") || inmueble.getImporte() == 0) {

            throw new CamposVaciosException();

        } else if (sistemaService.buscarInmuebleBoolean(inmueble.getCodigo()) == true) {
            throw new InmuebleRegistradoException();
        } else {
            sistemaService.addInmueble(inmueble);
        }

    }

    @GetMapping("/Inmuebles")
    public List<Inmueble> getInmuebles() {
        return sistemaService.getInmuebles();
    }

    @DeleteMapping("/deletInmueble/{dni}")
    public void removeInmueble(@PathVariable("dni") int codigo) throws InmubleNoExisteException {
        Optional<Inmueble> optionalInmueble = Optional.ofNullable(sistemaService.buscarInmueble(codigo));

        if (optionalInmueble.isPresent()) {
            sistemaService.removeInmueble(codigo);

        } else {
            throw new InmubleNoExisteException();
        }
    }

    @PutMapping("/actualizarInmueble")
    public void updateCliente(@RequestBody Inmueble inmueble) throws CamposVaciosException {
        if (inmueble.getDomicilio().equals("") || inmueble.getImporte() == 0) {

            throw new CamposVaciosException();

        } else {
            sistemaService.updateInmueble(inmueble);
        }
    }

    // INMUEBLES

    @PostMapping("/agregarCobranza/{dni}/{codigo}/{numero}")
    public void addCobranza(@PathVariable("dni") String cliente, @PathVariable("codigo") int inmueble, @PathVariable("numero") int numero) throws InmubleNoExisteException, CobranzaRegistradoException, ClienteNoExisteException {

        if (sistemaService.buscarClienteBoolean(cliente) == true) {

            if (sistemaService.buscarInmuebleBoolean(inmueble) == true) {

                if (sistemaService.buscarCobranzaBoolean(numero) == false) {

                    Cobranza cobranza = new Cobranza(numero, "16/11/2021", sistemaService.buscarCliente(cliente), sistemaService.buscarInmueble(inmueble));
                    sistemaService.addCobranza(cobranza);

                } else {
                    throw new CobranzaRegistradoException();
                }

            } else {
                throw new InmubleNoExisteException();
            }


        } else {
            throw new ClienteNoExisteException();
        }

    }


    @GetMapping("/Cobranzas")
    public List<Cobranza> getCobranza() {
        return sistemaService.getCobranzas();
    }

    @PostMapping("/addCobranza")
    public void addCo(@RequestBody Cobranza cobranza) {
        sistemaService.addCobranza(cobranza);
    }
*/
}
