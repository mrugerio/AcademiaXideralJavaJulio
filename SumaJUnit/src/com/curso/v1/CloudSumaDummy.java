package com.curso.v1;

class CloudSumaDummy implements CloudSuma {

    @Override
    public int ejecutaSuma(int x, int y) {
        return x + y; //ESTE ES EL PROBLEMA 
    }

}