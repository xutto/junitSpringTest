package com.junitSpringTest.model;

import org.springframework.context.annotation.Scope;

/**
 * Created by XI319411 on 18/12/2015.
 */
@Scope("singleton")
public class MiBean {

    private String nombre ;
    private String apellido;

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
