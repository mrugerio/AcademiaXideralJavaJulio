package com.curso.v0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class SumaTest {

    @InjectMocks
    private Suma suma;

    @Mock
    private CloudSuma cloudSuma;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);  // Inicializa los mocks y las inyecciones.
    }

    @Test
    public void testCalculaSuma() {
        int x = 5;
        int y = 8;

        // Definimos el comportamiento del mock
        Mockito.when(cloudSuma.ejecutaSuma(x, y)).thenReturn(13);

        // Llamamos al método que queremos probar
        int resultado = suma.calculaSuma(x, y);

        // Verificamos que el resultado sea el esperado
        Assertions.assertEquals(13, resultado);
    }

}
