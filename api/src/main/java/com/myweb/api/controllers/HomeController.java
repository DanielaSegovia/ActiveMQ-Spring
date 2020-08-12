package com.myweb.api.controllers;

import com.myweb.api.facade.PersonaServiceFacade;
import com.myweb.api.model.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("/personas/")
public class HomeController {

    @Autowired
    private PersonaServiceFacade personaServiceFacade;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Persona guardarEstudiante(@RequestBody @Validated Persona persona) {
        return personaServiceFacade.guardarPersona(persona);
    }
    
    
    @RequestMapping(value = "/{documento}", method = RequestMethod.GET)
    public Persona findByDocumento(@PathVariable String documento) {
        return personaServiceFacade.findByDocumento(documento);
    }

}