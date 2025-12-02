package org.example;

public class ObicnaKnjiga extends Knjiga implements Status {
    private String status;
    public ObicnaKnjiga(String ISBN, double brojStranica) {
        super(ISBN, brojStranica);
    }

    @Override
    protected double izracunajVrijednost() {
        return brojStranica * 0.5;
    }

    @Override
    public void azurirajStatus(String status) {
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
