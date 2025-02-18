package model;

import java.util.ArrayList;
import java.util.List;

public class Personaj {
    private int id;
    private String nume;
    private String locOrigine;
    private List<Produs> produseDetinute;

    public Personaj(int id, String nume, String locOrigine) {
        this.id = id;
        this.nume = nume;
        this.locOrigine = locOrigine;
        this.produseDetinute = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    public String getLocOrigine() { return locOrigine; }
    public void setLocOrigine(String locOrigine) { this.locOrigine = locOrigine; }
    public List<Produs> getProduseDetinute() { return produseDetinute; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nume: " + nume + ", Origine: " + locOrigine + ", Produse: " + produseDetinute;
    }
}
