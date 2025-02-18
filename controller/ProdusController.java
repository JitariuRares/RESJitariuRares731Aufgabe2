package controller;

import model.Produs;
import java.util.ArrayList;
import java.util.List;

public class ProdusController {
    private List<Produs> produse = new ArrayList<>();

    public void adaugaProdus(Produs produs) {
        produse.add(produs);
    }

    public void editeazaProdus(int index, String numeNou, double pretNou, String universumNou) {
        if (index >= 0 && index < produse.size()) {
            Produs produs = produse.get(index);
            produs.setNume(numeNou);
            produs.setPret(pretNou);
            produs.setUniversum(universumNou);
            System.out.println("Produsul a fost editat cu succes!");
        } else {
            System.out.println("Index invalid!");
        }
    }

    public void stergeProdus(int index) {
        if (index >= 0 && index < produse.size()) {
            produse.remove(index);
            System.out.println("Produsul a fost șters cu succes!");
        } else {
            System.out.println("Index invalid!");
        }
    }

    public void afiseazaProduse() {
        if (produse.isEmpty()) {
            System.out.println("Nu există produse.");
        } else {
            for (int i = 0; i < produse.size(); i++) {
                System.out.println((i + 1) + ". " + produse.get(i));
            }
        }
    }

    public List<Produs> getProduse() {
        return produse;
    }
}
