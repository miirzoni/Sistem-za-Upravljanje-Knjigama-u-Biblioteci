package org.example;

public class RijetkaKnjiga extends ObicnaKnjiga{
    public RijetkaKnjiga(String ISBN, double brojStranica) {
        super(ISBN, brojStranica);
    }
    @Override
    protected double izracunajVrijednost() {
        return super.izracunajVrijednost() * 2;
    }
}
