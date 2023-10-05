package com.curso.jueves5;

public class EjemploAssert {
    public static void main(String[] args) {
        int valor = 5;
        
        // Esto no hará nada porque la condición es verdadera
        // assert valor == 5 : "Valor incorrecto";
        
        // Esto lanzará un AssertionError con el mensaje "Valor incorrecto"
        assert valor == 8 : "Valor incorrecto";
    }
}
