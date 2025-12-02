package org.example;

public abstract class Knjiga {
    protected String ISBN;
    protected double brojStranica;

    public Knjiga(String ISBN, double brojStranica) {
        if(brojStranica <= 0) throw new IllegalArgumentException("Broj stranica ne moze biti manji od 0!");
        this.ISBN = ISBN;
        this.brojStranica = brojStranica;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getBrojStranica() {
        return brojStranica;
    }

    protected abstract double izracunajVrijednost();
}
