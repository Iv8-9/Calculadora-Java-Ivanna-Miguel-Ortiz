package src.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import src.main.java.Operaciones;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(9, Operaciones.sumar(4, 5), 0.001);
    }

    @Test
    public void testRestar() {
        assertEquals(2, Operaciones.restar(5, 3), 0.001); 
    }
	 
    @Test
    public void testMultiplicar() {
        assertEquals(15, Operaciones.multiplicar(3, 5), 0.001);
    }

    @Test
    public void testDividir() {
        assertEquals(4, Operaciones.dividir(20, 5), 0.001);
    }
}

