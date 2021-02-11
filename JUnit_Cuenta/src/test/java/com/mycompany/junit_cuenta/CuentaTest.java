package com.mycompany.junit_cuenta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
        assertThat(1423.0, is(c.getSaldo()));
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
        assertThat(1350.0, is(c.getSaldo()));
    }

    @Test
    public void testIngresar_String_double() throws Exception {
        c.ingresar("Nomina Pollitos Inc", 1423.0);
        assertThat(1423.0, is(c.getSaldo()));
    }

    @Test
    public void testRetirar_String_double() throws Exception {
        c.ingresar("Ingreso", 1500.0);
        c.retirar("Sacar efectivo", 150.0);
        assertThat(1350.0, is(c.getSaldo()));
    }

    @Test
    public void testGetSaldo() throws Exception {
        c.ingresar("Ingreso", 1500.0);
        assertThat(c.getSaldo(), is(1500.0));
        c.retirar("Sacar efectivo", 1400);
        assertThat(c.getSaldo(), is(100.0));
    }

    @Test
    public void testAddMovimiento() {
       Movimiento m = new Movimiento();
		m.setConcepto("Devuelto por hacienda");
		m.setImporte(986.0);
		c.addMovimiento(m);
		assertThat(c.getSaldo(), is(986.0));
		
		Movimiento mov = new Movimiento();
		mov.setConcepto("Pago Mercadona");
		mov.setImporte(-125.6);
		c.addMovimiento(mov);
		assertThat(c.getSaldo(), is(860.4));	
    }

}
