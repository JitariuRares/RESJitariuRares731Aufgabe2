package controller;

import model.Personaj;
import model.Produs;

import java.util.ArrayList;
import java.util.List;

public class PersonajController {
    private List<Personaj> personaje = new ArrayList<>();
    private int nextId = 1;

    public void adaugaPersonaj(String nume, String locOrigine) {
        personaje.add(new Personaj(nextId++, nume, locOrigine));
    }

    public void editeazaPersonaj(int id, String numeNou, String locNou) {
        for (Personaj p : personaje) {
            if (p.getId() == id) {
                p.setNume(numeNou);
                p.setLocOrigine(locNou);
                System.out.println("Personajul a fost editat cu succes!");
                return;
            }
        }
        System.out.println("Personaj inexistent!");
    }

    public void stergePersonaj(int id) {
        if (personaje.removeIf(p -> p.getId() == id)) {
            System.out.println("Personajul a fost șters cu succes!");
        } else {
            System.out.println("Personaj inexistent!");
        }
    }

    public void afiseazaPersonaje() {
        if (personaje.isEmpty()) {
            System.out.println("Nu există personaje.");
        } else {
            for (Personaj p : personaje) {
                System.out.println(p);
            }
        }
    }

    public void filtreazaPersonajeDupaOrigine(String origine) {
        boolean gasit = false;
        for (Personaj p : personaje) {
            if (p.getLocOrigine().equalsIgnoreCase(origine)) {
                System.out.println(p);
                gasit = true;
            }
        }
        if (!gasit) {
            System.out.println("Nu există personaje din această regiune.");
        }
    }

    public void afiseazaPersonajeCuProduseDinRegiune(String regiune) {
        boolean gasit = false;
        for (Personaj p : personaje) {
            for (Produs prod : p.getProduseDetinute()) {
                if (prod.getUniversum().equalsIgnoreCase(regiune)) {
                    System.out.println(p);
                    gasit = true;
                    break;
                }
            }
        }
        if (!gasit) {
            System.out.println("Nu există personaje care au cumpărat produse din această regiune.");
        }
    }
}
