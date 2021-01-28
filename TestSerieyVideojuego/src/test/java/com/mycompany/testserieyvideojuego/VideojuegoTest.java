package com.mycompany.testserieyvideojuego;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VideojuegoTest {
    
    private Videojuego v, v1;
    
    @Before
    public void setUp() {
        v = new Videojuego("The Last of Us", 30, "Survival horror", "Sony Computer Entertainment");
        v1 = new Videojuego();
    }
    
    @After
    public void tearDown() {
        v = null;
        v1 = null;
    }

    /**
     * Test of getTitulo method, of class Videojuego.
     */
    @Test
    public void testGetTitulo() {
       assertEquals("The Last of Us", v.getTitulo());
    }

    /**
     * Test of setTitulo method, of class Videojuego.
     */
    @Test
    public void testSetTitulo() {
        v1.setTitulo("Packman");
        assertEquals("Packman", v1.getTitulo());
    }

    /**
     * Test of getHorasEstimadas method, of class Videojuego.
     */
    @Test
    public void testGetHorasEstimadas() {
       assertEquals(30, v.getHorasEstimadas());
    }

    /**
     * Test of setHorasEstimadas method, of class Videojuego.
     */
    @Test
    public void testSetHorasEstimadas() {
        v1.setHorasEstimadas(25);
        assertEquals(25, v1.getHorasEstimadas());
    }

    /**
     * Test of getGenero method, of class Videojuego.
     */
    @Test
    public void testGetGenero() {
        assertEquals("Survival horror", v.getGenero());
    }

    /**
     * Test of setGenero method, of class Videojuego.
     */
    @Test
    public void testSetGenero() {
        v1.setGenero("horror");
        assertEquals("horror", v1.getGenero());
    }

    /**
     * Test of getcompañia method, of class Videojuego.
     */
    @Test
    public void testGetcompañia() {
        assertEquals("Sony Computer Entertainment", v.getcompañia());
    }

    /**
     * Test of setcompañia method, of class Videojuego.
     */
    @Test
    public void testSetcompañia() {
        v1.setcompañia("Nintendo");
        assertEquals("Nintendo", v1.getcompañia());
    }

    /**
     * Test of entregar method, of class Videojuego.
     */
    @Test
    public void testEntregar() {
        v.entregar();
        assertEquals(true, v.isEntregado());
    }

    /**
     * Test of devolver method, of class Videojuego.
     */
    @Test
    public void testDevolver() {
        v.entregar();
        v.devolver();
        assertEquals(false, v.isEntregado());
    }

    /**
     * Test of isEntregado method, of class Videojuego.
     */
    @Test
    public void testIsEntregado() {
        assertEquals(false, v.isEntregado());
        v.entregar();
        assertEquals(true, v.isEntregado());
        v.devolver();
        assertEquals(false, v.isEntregado());
    }

    /**
     * Test of compareTo method, of class Videojuego.
     */
    @Test
    public void testCompareTo() {
        assertEquals(-1, v.compareTo(v1));
        assertEquals(1, v1.compareTo(v));
        v1.setHorasEstimadas(30);
        assertEquals(0, v.compareTo(v1));
    }

    /**
     * Test of toString method, of class Videojuego.
     */
    @Test
    public void testToString() {
        String result = "Informacion del videojuego: \n" +
               "\tTitulo: "+"The Last of Us"+"\n" +
               "\tHoras estimadas: "+30+"\n" +
               "\tGenero: "+"Survival horror"+"\n" +
               "\tcompañia: "+"Sony Computer Entertainment";
        assertEquals(result, v.toString());
    }

  
    /**
     * Test of equals method, of class Videojuego.
     */
    @Test
    public void testEquals() {
        v1 = new Videojuego("The Last of Us", "Sony Computer Entertainment");
        assertEquals(true, v.equals(v1));
        v1.setTitulo("Super Mario");
        assertEquals(false, v.equals(v1));
    }
    
}
