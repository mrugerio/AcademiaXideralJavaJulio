package com.curso.v0;

public class ServicioFinanciero {
    private CalculadoraFinanciera calculadora;

    public ServicioFinanciero(CalculadoraFinanciera calculadora) {
        this.calculadora = calculadora;
    }

    public double calcularInteresTotal(double principal, double tasa, int años) {
        return calculadora.calcularInteres(principal, tasa, años);
    }
}
