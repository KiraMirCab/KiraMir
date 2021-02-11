
package com.mycompany.junit_cuenta;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author Kira
 */
public class CreditoTest {
    
   Credito c;
    
    @BeforeEach
    public void setUp() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fecha = sdf.parse("2025-07-26");
        c = new Credito("1267 7899 4039 8476", "JUANITO HEAVY METALITO", fecha, 10000.00);
    }
    
    @AfterEach
    public void tearDown() {
        c = null;
    }

    @Test
    public void testRetirar() throws Exception {
        c.retirar(150.0);
        assertThat(9842.5, is(c.getSaldo()));
    }
    
    @Test
    public void testRetiradaException() {
        try {
            c.retirar(15000);
        } catch (Exception ex) {
            assertEquals("Credito insuficiente", ex.getMessage());
        }
    }
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double x = 0.0;
        Credito instance = null;
        instance.ingresar(x);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPagoEnEstablecimiento() throws Exception {
        System.out.println("pagoEnEstablecimiento");
        String datos = "";
        double x = 0.0;
        Credito instance = null;
        instance.pagoEnEstablecimiento(datos, x);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Credito instance = null;
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCreditoDisponible() {
        System.out.println("getCreditoDisponible");
        Credito instance = null;
        double expResult = 0.0;
        double result = instance.getCreditoDisponible();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLiquidar() {
        System.out.println("liquidar");
        int mes = 0;
        int ano = 0;
        Credito instance = null;
        instance.liquidar(mes, ano);
        fail("The test case is a prototype.");
    }
    
}
