
package com.mycompany.herencia;

public class Alumno extends Persona {

    public Alumno() {
        super(); 
        System.out.println("Se crea Alumno...");
    }

    @Override
    public String toString() {
        String nombre = "Sin nombre";
        return "Un alumno llamado: " + nombre;
    }
}