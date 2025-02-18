package model;

public class Produs {
    private String nume;
    private double pret;
    private String universum;

    public Produs(String nume, double pret, String regiuneOrigine) {
        this.nume = nume;
        this.pret = pret;
        this.universum = regiuneOrigine;
    }

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    public double getPret() { return pret; }
    public void setPret(double pret) { this.pret = pret; }
    public String getUniversum() { return universum; }
    public void setUniversum(String universum) { this.universum = universum; }

    @Override
    public String toString() {
        return "Produs: " + nume + ", Pret: " + pret + ", Regiune: " + universum;
    }
}
