package com.curso.jueves5;
import java.text.NumberFormat;
import java.text.ParseException;

public class Align3 {

    public static void main(String[] args) throws ParseException {

        String cadena = "222.288881234";

        NumberFormat nf = NumberFormat.getInstance();
        
        //nf.setMaximumFractionDigits(3); //NO FUNCIONA
        
        Number resultado = nf.parse(cadena);
        
        System.out.println(resultado);
 
    }

}
