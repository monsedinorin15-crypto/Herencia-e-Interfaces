package com.mycompany.herenciafiguras;


public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return (double) (alto * ancho) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((alto * alto) + (ancho * ancho));
        return alto + ancho + hipotenusa;
    }

    @Override
    protected String imprimeFigura() {
        return String.format("Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f",
                alto, ancho, calcularArea(), calcularPerimetro());
    }
}