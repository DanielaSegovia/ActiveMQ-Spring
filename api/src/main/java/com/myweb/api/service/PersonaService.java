package com.myweb.api.service;

import com.myweb.api.model.Persona;

public interface PersonaService {

    Persona guardarPersona(Persona persona);
    
    Persona findByDocumento(String documento);
}