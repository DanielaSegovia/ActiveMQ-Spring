package com.myweb.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



@Entity
@Table(name = "Persona")
public class Persona {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    @Column(columnDefinition = "serial")

    private Long id; 
    private String documento; 
    private String nombre; 
    private String apellido; 


    public Persona() {  
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}