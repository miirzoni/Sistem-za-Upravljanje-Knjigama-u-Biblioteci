package org.example;

import org.junit.Test;
import java.util.HashMap;

import static org.junit.Assert.*;

public class KnjigaTest {

    @Test
    public void testKreiranjeObicneKnjige() {
        ObicnaKnjiga o = new ObicnaKnjiga("978-11", 200);

        assertEquals("978-11", o.getISBN());
        assertEquals(200, o.getBrojStranica());
        assertEquals("Kreirana", o.getStatus());   // ako si stavio default
    }

    @Test
    public void testKreiranjeRijetkeKnjige() {
        RijetkaKnjiga r = new RijetkaKnjiga("978-33", 100);

        assertEquals("978-33", r.getISBN());
        assertEquals(100, r.getBrojStranica());
        assertTrue(r instanceof Knjiga);
    }

    @Test
    public void testAzuriranjeStatusa() {
        ObicnaKnjiga o = new ObicnaKnjiga("978-22", 150);
        o.azurirajStatus("Posuđena");

        assertEquals("Posuđena", o.getStatus());
    }

    @Test
    public void testAzuriranjeStatusaRijetka() {
        RijetkaKnjiga r = new RijetkaKnjiga("978-44", 300);
        r.azurirajStatus("Rezervisana");

        assertEquals("Rezervisana", r.getStatus());
    }

    @Test
    public void testVrijednostObicneKnjige() {
        ObicnaKnjiga o = new ObicnaKnjiga("978-11", 200);
        double expected = 200 * 0.5;   // ako koristiš tu formulu

        assertEquals(expected, o.izracunajVrijednost(), 0.01);
    }

    @Test
    public void testVrijednostRijetkeKnjige() {
        RijetkaKnjiga r = new RijetkaKnjiga("978-44", 300);
        double expected = 300 * 0.5 * 2;  // npr. rijetka = 2x vrednija

        assertEquals(expected, r.izracunajVrijednost(), 0.01);
    }

        @Test
    public void testDodavanjeUHashMap() {
        HashMap<String, Knjiga> mapa = new HashMap<>();

        ObicnaKnjiga o = new ObicnaKnjiga("978-55", 120);
        mapa.put(o.getISBN(), o);

        assertTrue(mapa.containsKey("978-55"));
        assertEquals(o, mapa.get("978-55"));
    }

    @Test
    public void testPretragaUHashMap() {
        HashMap<String, Knjiga> mapa = new HashMap<>();

        RijetkaKnjiga r = new RijetkaKnjiga("978-99", 222);
        mapa.put(r.getISBN(), r);

        Knjiga pronadjena = mapa.get("978-99");

        assertNotNull(pronadjena);
        assertTrue(pronadjena instanceof RijetkaKnjiga);
    }
}
