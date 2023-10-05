package com.curso.jueves5;

import java.text.NumberFormat;

public class FormatoEjemplo {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMaximumFractionDigits(4);

        double numero = 123.4567876;
        String output = formatter.format(numero);
        System.out.println(output);  // Esto imprimirá "123.46"
    }
}





