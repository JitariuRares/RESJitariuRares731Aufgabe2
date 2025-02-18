package view;

import controller.ProdusController;
import controller.PersonajController;
import model.Produs;

import java.util.Scanner;

public class ProdusView {
    private Scanner scanner = new Scanner(System.in);
    private ProdusController produsController = new ProdusController();
    private PersonajController personajController = new PersonajController();

    public void start() {
        boolean ruleaza = true;
        while (ruleaza) {
            afiseazaMeniu();
            int optiune = scanner.nextInt();
            scanner.nextLine(); // Consumă linia rămasă

            switch (optiune) {
                case 1 -> adaugaProdus();
                case 2 -> produsController.afiseazaProduse();
                case 3 -> editeazaProdus();
                case 4 -> stergeProdus();
                case 5 -> adaugaPersonaj();
                case 6 -> personajController.afiseazaPersonaje();
                case 7 -> editeazaPersonaj();
                case 8 -> stergePersonaj();
//                case 9 -> filtreazaPersonajeDupaOrigine();
//                case 10 -> afiseazaPersonajeCuProduseDinRegiune();
//                case 11 -> ruleaza = false;
                default -> System.out.println("Opțiune invalidă!");
            }
        }
    }

    private void afiseazaMeniu() {
        System.out.println("\n--- Meniu ---");
        System.out.println("1. Adaugă produs");
        System.out.println("2. Afișează produse");
        System.out.println("3. Editează produs");
        System.out.println("4. Șterge produs");
        System.out.println("5. Adaugă personaj");
        System.out.println("6. Afișează personaje");
        System.out.println("7. Editează personaj");
        System.out.println("8. Șterge personaj");
//        System.out.println("9. Filtrează personaje după origine");
//        System.out.println("10. Afișează personaje cu produse din regiune");
//        System.out.println("11. Ieșire");
        System.out.print("Alege o opțiune: ");
    }

    private void adaugaProdus() {
        System.out.print("Introdu numele produsului: ");
        String nume = scanner.nextLine();

        System.out.print("Introdu prețul produsului: ");
        double pret = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Introdu regiunea de origine: ");
        String regiune = scanner.nextLine();

        produsController.adaugaProdus(new Produs(nume, pret, regiune));
        System.out.println("Produsul a fost adăugat cu succes!");
    }

    private void editeazaProdus() {
        produsController.afiseazaProduse();
        System.out.print("Alege numărul produsului de editat: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        System.out.print("Introdu noul nume: ");
        String numeNou = scanner.nextLine();
        System.out.print("Introdu noul preț: ");
        double pretNou = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Introdu noua regiune: ");
        String regiuneNoua = scanner.nextLine();

        produsController.editeazaProdus(index, numeNou, pretNou, regiuneNoua);
    }

    private void stergeProdus() {
        produsController.afiseazaProduse();
        System.out.print("Alege numărul produsului de șters: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        produsController.stergeProdus(index);
    }


    private void adaugaPersonaj() {
        System.out.print("Introdu numele personajului: ");
        String nume = scanner.nextLine();
        System.out.print("Introdu locul de origine: ");
        String origine = scanner.nextLine();
        personajController.adaugaPersonaj(nume, origine);
        System.out.println("Personajul a fost adăugat cu succes!");
    }

    private void editeazaPersonaj() {
        personajController.afiseazaPersonaje();
        System.out.print("Introdu ID-ul personajului de editat: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introdu noul nume: ");
        String numeNou = scanner.nextLine();
        System.out.print("Introdu noul loc de origine: ");
        String locNou = scanner.nextLine();

        personajController.editeazaPersonaj(id, numeNou, locNou);
    }

    private void stergePersonaj() {
        personajController.afiseazaPersonaje();
        System.out.print("Introdu ID-ul personajului de șters: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        personajController.stergePersonaj(id);
    }
}

//    private void filtreazaPersonajeDupaOrigine() {
//        System.out.print("Introdu regiunea de origine a personajelor: ");
//        String origine = scanner.nextLine();
//        personajController.filtreazaPersonajeDupaOrigine(origine);
//    }

//    private void afiseazaPersonajeCuProduseDinRegiune() {
//        System.out.print("Introdu regiunea produsului: ");
//        String regiune = scanner.nextLine();
//        personajController.afiseazaPersonajeCuProduseDinRegiune(regiune);
//    }
//}
