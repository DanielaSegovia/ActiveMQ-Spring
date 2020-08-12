package com.myweb.api.service.impl;

import com.myweb.api.model.Persona;
import com.myweb.api.repository.PersonaRepository;
import com.myweb.api.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }
    
    @Override
    public Persona findByDocumento(String documento) {
        return personaRepository.findByDocumento(documento);
    }

    
}