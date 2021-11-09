package com.example.springcoredojo.Practica;

import org.springframework.stereotype.Component;

@Component
public class Usuario {
    private Alumno alumno;

    public Usuario(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Alumno: " + alumno +
                '}';
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
