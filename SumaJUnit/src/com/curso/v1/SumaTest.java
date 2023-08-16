package com.curso.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumaTest {

    private Suma suma;
    private CloudSumaDummy cloudSumaDummy;

    @BeforeEach
    public void setup() {
        suma = new Suma();
        cloudSumaDummy = new CloudSumaDummy();
        // Inyectamos la implementación dummy en nuestra clase Suma.
        suma.cloudSuma = cloudSumaDummy;  
    }

    @Test
    public void testCalculaSuma() {
        int x = 5;
        int y = 8;

        int resultado = suma.calculaSuma(x, y);
        // Verificamos que el resultado sea 13.
        Assertions.assertEquals(13, resultado);  
    }

}

