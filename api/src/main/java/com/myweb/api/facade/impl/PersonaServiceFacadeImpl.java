package com.myweb.api.facade.impl;

import com.myweb.api.facade.PersonaServiceFacade;
import com.myweb.api.model.Persona;
import com.myweb.api.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceFacadeImpl implements PersonaServiceFacade {

    @Autowired
    private PersonaService personaService;

    @Override
    public Persona guardarPersona(Persona persona) {
       return personaService.guardarPersona(persona);
    }

    @Override
    public Persona findByDocumento(String documento) {
        return personaService.findByDocumento(documento);
    }
    
}