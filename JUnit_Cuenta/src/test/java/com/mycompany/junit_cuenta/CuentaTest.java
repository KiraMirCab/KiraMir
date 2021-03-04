package com.mycompany.junit_cuenta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Kira
 */
public class CuentaTest {

    Cuenta c;

    @BeforeEach
    public void setUp() {
        c = new Cuenta("1267 7899 4039 8476", "JUANITO HEAVY METALITO");
    }

    @AfterEach
    public void tearDown() {
        c = null;
    }

    @Test
    public void testIngresar_double() throws Exception {
        c.ingresar(1423.0);
        assertEquals(1423.0, c.getSaldo());
    }

    @Test
    public void testIngresoNegativoException() {
        try {
            c.ingresar(-3.0);
        } catch (Exception ex) {
            assertEquals("No se puede ingresar una cantidad negativa", ex.getMessage());
        }
    }

    @Test
    public void testRetirar_double() throws Exception {
        c.ingresar(1500.0);
        c.retirar(150.0);
        assertEquals(1350.0, c.getSaldo());
    }

    @Test
    public void testIngresar_String_double() throws Exception {
        c.ingresar("Nomina Pollitos Inc", 1423.0);
        assertEquals(1423.0, c.getSaldo());
    }

    @Test
    public void testRetirar_String_double() throws Exception {
        c.ingresar("Ingreso", 1500.0);
        c.retirar("Sacar efectivo", 150.0);
        assertEquals(1350.0, c.getSaldo());
    }

    @Test
    public void testGetSaldo() throws Exception {
        c.ingresar("Ingreso", 1500.0);
        assertEquals(c.getSaldo(), 1500.0);
        c.retirar("Sacar efectivo", 1400);
        assertEquals(c.getSaldo(), 100.0);
    }

    @Test
    public void testAddMovimiento() {
       Movimiento m = new Movimiento();
		m.setConcepto("Devuelto por hacienda");
		m.setImporte(986.0);
		c.addMovimiento(m);
		assertEquals(c.getSaldo(), 986.0);
		
		Movimiento mov = new Movimiento();
		mov.setConcepto("Pago Mercadona");
		mov.setImporte(-125.6);
		c.addMovimiento(mov);
		assertEquals(c.getSaldo(), 860.4);	
    }

}
