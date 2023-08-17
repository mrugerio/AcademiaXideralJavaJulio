package com.curso.v0;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioFinancieroTest {

    private CalculadoraFinanciera calculadoraMock;
    private ServicioFinanciero servicio;

    @BeforeEach
    public void setUp() {
        calculadoraMock = mock(CalculadoraFinanciera.class);
        servicio = new ServicioFinanciero(calculadoraMock); //INYECCIÓN DE DEPENDENCIAS
    }

    @Test
    public void testCalcularInteresTotal() {
        // Configura el mock para devolver un valor específico
        when(calculadoraMock.calcularInteres(1000.0, 0.05, 2)).thenReturn(100.0);

        // Llama al método que quieres probar
        double resultado = servicio.calcularInteresTotal(1000.0, 0.05, 2);

        // Verifica el resultado
        assertEquals(100.0, resultado, 0.01);

        // Asegúrate de que el mock fue llamado con los argumentos correctos
        verify(calculadoraMock).calcularInteres(1000.0, 0.05, 2);
    }
}
