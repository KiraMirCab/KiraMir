package com.mycompany.testserieyvideojuego;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SerieTest {

    private Serie s, s1;

    @Before
    public void setUp() {
        s = new Serie("Dirk Gently", 2, "comedia, ciencia ficción", "Max Landis");
        s1 = new Serie();
    }
    
    @After
    public void close() {
        s = null;
        s1 = null;
    }

    /**
     * Test of getTitulo method, of class Serie.
     */
    @Test
    public void testGetTitulo() {
        assertEquals("Dirk Gently", s.getTitulo());
    }

    /**
     * Test of setTitulo method, of class Serie. ????????
     */
    @Test
    public void testSetTitulo() {
        s1.setTitulo("Dirk Gently");
        assertEquals("Dirk Gently", s1.getTitulo());
    }

    /**
     * Test of getnumeroTemporadas method, of class Serie.
     */
    @Test
    public void testGetnumeroTemporadas() {
       assertEquals(2, s.getnumeroTemporadas());
    }

    /**
     * Test of setnumeroTemporadas method, of class Serie.
     */
    @Test
    public void testSetnumeroTemporadas() {
        s1.setnumeroTemporadas(2);
        assertEquals(2, s1.getnumeroTemporadas());
    }

    /**
     * Test of getGenero method, of class Serie.
     */
    @Test
    public void testGetGenero() {
        s = new Serie("Dirk Gently", 2, "comedia", "Max Landis");
        assertEquals("comedia", s.getGenero());
    }

    /**
     * Test of setGenero method, of class Serie.
     */
    @Test
    public void testSetGenero() {
        s1.setGenero("Comedia");
        assertEquals("Comedia", s1.getGenero());
    }

    /**
     * Test of getcreador method, of class Serie.
     */
    @Test
    public void testGetcreador() {
       assertEquals("Max Landis", s.getcreador());
    }

    /**
     * Test of setcreador method, of class Serie.
     */
    @Test
    public void testSetcreador() {
       s1.setcreador("Max Landis");
        assertEquals("Max Landis", s1.getcreador());
    }

    /**
     * Test of entregar method, of class Serie.
     */
    @Test
    public void testEntregar() {
        s1.entregar();
        assertEquals(true, s1.isEntregado());
    }

    /**
     * Test of devolver method, of class Serie.
     */
    @Test
    public void testDevolver() {
        s1.entregar();
        s1.devolver();
        assertEquals(false, s.isEntregado());
    }

    /**
     * Test of isEntregado method, of class Serie.
     */
    @Test
    public void testIsEntregado() {
        assertEquals(false, s1.isEntregado());
        s1.entregar();
        assertEquals(true, s1.isEntregado());
        s1.devolver();
        assertEquals(false, s1.isEntregado());
    }

    /**
     * Test of compareTo method, of class Serie.
     */
    @Test
    public void testCompareTo() {
        Serie d = new Serie("Dirk Gently", 2, "comedia", "Max Landis");
        assertEquals(-1, d.compareTo(s1));
        assertEquals(1, s1.compareTo(d));
        s1.setnumeroTemporadas(2);
        assertEquals(0, s1.compareTo(d));
    }

    /**
     * Test of toString method, of class Serie.
     */
    @Test
    public void testToString() {
        String result = "Informacion de la Serie: \n"
                + "\tTitulo: " + "Dirk Gently" + "\n"
                + "\tNumero de temporadas: " + 2 + "\n"
                + "\tGenero: " + "comedia, ciencia ficción" + "\n"
                + "\tCreador: " + "Max Landis";
        assertEquals(result, s.toString());
    }

    /**
     * Test of equals method, of class Serie.
     */
    @Test
    public void testEquals() {
        s1 = new Serie("Dirk Gently", "Max Landis");
        assertEquals(true, s.equals(s1));
        s1.setTitulo("Fear the Walking Dead");
        assertEquals(false, s.equals(s1));
    }

}
