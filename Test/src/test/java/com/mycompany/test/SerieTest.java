package com.mycompany.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SerieTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * Test of getTitulo method, of class Serie.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Serie instance = new Serie();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setTitulo method, of class Serie.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Serie instance = new Serie();
        instance.setTitulo(titulo);
        
    }

    /**
     * Test of getnumeroTemporadas method, of class Serie.
     */
    @Test
    public void testGetnumeroTemporadas() {
        System.out.println("getnumeroTemporadas");
        Serie instance = new Serie();
        int expResult = 0;
        int result = instance.getnumeroTemporadas();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setnumeroTemporadas method, of class Serie.
     */
    @Test
    public void testSetnumeroTemporadas() {
        System.out.println("setnumeroTemporadas");
        int numeroTemporadas = 0;
        Serie instance = new Serie();
        instance.setnumeroTemporadas(numeroTemporadas);
        
    }

    /**
     * Test of getGenero method, of class Serie.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Serie instance = new Serie();
        String expResult = "";
        String result = instance.getGenero();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGenero method, of class Serie.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String genero = "";
        Serie instance = new Serie();
        instance.setGenero(genero);
        
    }

    /**
     * Test of getcreador method, of class Serie.
     */
    @Test
    public void testGetcreador() {
        System.out.println("getcreador");
        Serie instance = new Serie();
        String expResult = "";
        String result = instance.getcreador();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setcreador method, of class Serie.
     */
    @Test
    public void testSetcreador() {
        System.out.println("setcreador");
        String creador = "";
        Serie instance = new Serie();
        instance.setcreador(creador);
        
    }

    /**
     * Test of entregar method, of class Serie.
     */
    @Test
    public void testEntregar() {
        System.out.println("entregar");
        Serie instance = new Serie();
        instance.entregar();
        
    }

    /**
     * Test of devolver method, of class Serie.
     */
    @Test
    public void testDevolver() {
        System.out.println("devolver");
        Serie instance = new Serie();
        instance.devolver();
        
    }

    /**
     * Test of isEntregado method, of class Serie.
     */
    @Test
    public void testIsEntregado() {
        System.out.println("isEntregado");
        Serie instance = new Serie();
        boolean expResult = false;
        boolean result = instance.isEntregado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of compareTo method, of class Serie.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object a = null;
        Serie instance = new Serie();
        int expResult = 0;
        int result = instance.compareTo(a);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Serie.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Serie instance = new Serie();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Serie.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Serie a = null;
        Serie instance = new Serie();
        boolean expResult = false;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);
       
    }

}
