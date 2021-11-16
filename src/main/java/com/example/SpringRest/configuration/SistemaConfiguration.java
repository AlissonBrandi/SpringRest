package com.example.SpringRest.configuration;


import com.example.SpringRest.exception.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SistemaConfiguration extends ResponseEntityExceptionHandler {


    //         Exepciones Clientes

    @ExceptionHandler({ ClienteNoExisteException.class })
    protected ResponseEntity<Object> ClienteNoExiste(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "El cliente no esta registrado",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler({ CamposVaciosException.class })
    protected ResponseEntity<Object> CamposVacios(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "Se debe llenar todos los campos",
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    @ExceptionHandler({ ClienteRegistradoException.class })
    protected ResponseEntity<Object> ClienteRegistrado(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "El cliente ya está registrado",
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    //         Exepciones Inmuebles

    @ExceptionHandler({ InmubleNoExisteException.class })
    protected ResponseEntity<Object> InmuebleNoExiste(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "El inmueble no está registrado.",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }



    @ExceptionHandler({ InmuebleRegistradoException.class })
    protected ResponseEntity<Object> InmuebleRegistrado(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "El inmueble ya está registrado.",
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    //         Exepciones Cobranza

    @ExceptionHandler({ CobranzaRegistradoException.class })
    protected ResponseEntity<Object> CobranzaRegistrado(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "La cobranza asociada a este número ya está registrado.",
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

}
