package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

class Test {

    @org.junit.jupiter.api.Test
    void testSuma() {
        OperacionAritmetica suma = new OperacionAritmetica(new Sumar());
        assertEquals(1, suma.procesar(0, 1));
    }

    @org.junit.jupiter.api.Test
    void testResta() {
        OperacionAritmetica resta = new OperacionAritmetica(new Resta());
        assertEquals(1, resta.procesar(2, 1));

        assertEquals(-2, resta.procesar(3, 6));
    }

    @org.junit.jupiter.api.Test
    void testMultiplicacion() {
        OperacionAritmetica multiplicacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(55, multiplicacion.procesar(11, 5));
    }

    @org.junit.jupiter.api.Test
    void testDivision() {
        OperacionAritmetica division = new OperacionAritmetica(new Division());
        assertEquals(25, division.procesar(100, 4));

        assertEquals(-3, division.procesar(100, 0));
    }

    @org.junit.jupiter.api.Test
    void testNumerosNegativos() {
    	
        OperacionAritmetica operacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(-1, operacion.procesar(-5, 1));
        assertEquals(-1, operacion.procesar(-5, -1));
    }

}
