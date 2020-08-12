package com.myweb.api.repository;

import com.myweb.api.model.Persona;

import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long>{
    
    public Persona findByDocumento(String documento);
}