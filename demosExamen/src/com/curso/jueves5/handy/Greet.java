package com.curso.jueves5.handy;

import com.curso.jueves5.handy.dandy.KeyStroke;

public class Greet{
    public static void main (String [] args){
        String greeting = "Hello";
        System.out.println(greeting);
        KeyStroke stroke = new KeyStroke();
        stroke.typeExclamation ();
    }
}