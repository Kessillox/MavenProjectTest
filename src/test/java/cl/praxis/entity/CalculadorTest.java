package cl.praxis.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba de suma de dos números")
    void testSuma(){
        int resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado, "2 + 3 debería ser 5");
    }

    @Test
    @DisplayName("Prueba de resta de dos números")
    void testResta(){
        int resultado = calculadora.resta(2, 3);
        assertEquals(-1, resultado, "2 - 3 debería ser -1");
    }

    @Test
    @DisplayName("Prueba de multiplicacion de dos números")
    void testMultiplicacion(){
        int resultado = calculadora.multiplica(2, 3);
        assertEquals(6, resultado, "2 * 3 debería ser 6");
    }
    @Test
    @DisplayName("Prueba de Division de dos números")
    void testDivision(){
        float resultado = calculadora.division(3, 2);
        assertEquals(1.5, resultado, "3 / 2 debería ser 1.5");
    }

}
