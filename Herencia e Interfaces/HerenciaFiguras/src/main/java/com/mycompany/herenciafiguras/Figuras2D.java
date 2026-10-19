
package com.mycompany.herenciafiguras;

public abstract class Figuras2D implements FiguraPlana {

    public Figuras2D() {
        System.out.println("Se imprime una FiguraPlana...");
    }

    protected abstract String imprimeFigura();
}