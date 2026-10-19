
package com.mycompany.herencia;


public class Profesor extends Persona {
    int numEmpleado;

    public Profesor(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + numEmpleado;
    }
}

