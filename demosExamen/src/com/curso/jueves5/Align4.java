package com.curso.jueves5;
import java.text.NumberFormat;
import java.text.ParseException;

public class Align4 {

    public static void main(String[] args){

        Double[] sa = {111.2342389, 222.567834};

        NumberFormat nf = NumberFormat.getInstance();
        
        nf.setMaximumFractionDigits(2);

        for (Double s: sa ) {

            System.out.println(nf.format(s));
        }

    }

}
