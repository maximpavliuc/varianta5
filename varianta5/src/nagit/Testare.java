package nagit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sat sat = new Sat("Satul 1", 100);
        Regiune regiune = new Regiune("Satul 2", 200, "Regiune 1");
        Oras oras = new Oras("Satul 3", 300, "Regiune 2", "Oras 1");
        Metropola metropola = new Metropola("Satul 4", 400, "Regiune 3", "Oras 2", "Metropola 1");

        List<Sat> listaSat = new ArrayList<>();
        listaSat.add(sat);
        listaSat.add(regiune);
        listaSat.add(oras);
        listaSat.add(metropola);

        System.out.println("Introduceti un criteriu de filtrare (nume, populatie, numeRegiune, numeOras, numeMetropola): ");
        String criteriu = scanner.nextLine();

        System.out.println("Introduceti valoarea criteriului: ");
        String valoare = scanner.nextLine();

        for (Sat s : listaSat) {
            if (s instanceof Regiune) {
                Regiune r = (Regiune) s;
                if (criteriu.equals("numeRegiune") && r.getNumeRegiune().equals(valoare)) {
                    System.out.println(s);
                }
            } else if (s instanceof Oras) {
                Oras o = (Oras) s;
                if (criteriu.equals("numeOras") && o.getNumeOras().equals(valoare)) {
                    System.out.println(s);
                }
            } else if (s instanceof Metropola) {
                Metropola m = (Metropola) s;
                if (criteriu.equals("numeMetropola") && m.getNumeMetropola().equals(valoare)) {
                    System.out.println(s);
                }
            } else {
                if (criteriu.equals("nume") && s.getNume().equals(valoare)) {
                    System.out.println(s);
                } else if (criteriu.equals("populatie") && Integer.parseInt(valoare) == s.getPopulatie()) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("Introduceti un al doilea criteriu de filtrare (nume, populatie, numeRegiune, numeOras, numeMetropola): ");
        String criteriu2 = scanner.nextLine();

        System.out.println("Introduceti valoarea celui de-al doilea criteriu: ");
        String valoare2 = scanner.nextLine();

        for (Sat s : listaSat) {
            if (s instanceof Regiune) {
                Regiune r = (Regiune) s;
                if (criteriu.equals("numeRegiune") && r.getNumeRegiune().equals(valoare) && criteriu2.equals("nume") && r.getNume().equals(valoare2)) {
                    System.out.println(s);
                }
            } else if (s instanceof Oras) {
                Oras o = (Oras) s;
                if (criteriu.equals("numeOras") && o.getNumeOras().equals(valoare) && criteriu2.equals("nume") && o.getNume().equals(valoare2)) {
                    System.out.println(s);
                }
            } else if (s instanceof Metropola) {
                Metropola m = (Metropola) s;
                if (criteriu.equals("numeMetropola") && m.getNumeMetropola().equals(valoare) && criteriu2.equals("nume") && m.getNume().equals(valoare2)) {
                    System.out.println(s);
                }
            } else {
                if (criteriu.equals("nume") && s.getNume().equals(valoare) && criteriu2.equals("populatie") && Integer.parseInt(valoare2) == s.getPopulatie()) {
                    System.out.println(s);
                } else if (criteriu.equals("populatie") && Integer.parseInt(valoare) == s.getPopulatie() && criteriu2.equals("nume") && s.getNume().equals(valoare2)) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("Introduceti numele unui obiect de tip Sat: ");
        String numeSat = scanner.nextLine();

        Sat satNou = new Sat(numeSat, 500);

        for (Sat s : listaSat) {
            if (s.equals(satNou)) {
                System.out.println("Coincide");
            } else {
                System.out.println("Nu coincide");
            }
        }
    }
}
