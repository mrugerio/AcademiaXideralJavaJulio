package com.curso.jueves5;
import java.text.NumberFormat;
import java.text.ParseException;

public class Align2 {

    public static void main(String[] args) throws ParseException {

        String cadena = "111.234";

        NumberFormat nf = NumberFormat.getInstance();
        
        Number resultado = nf.parse(cadena);
        
        System.out.println(resultado.intValue() + 100);
 
    }

}
