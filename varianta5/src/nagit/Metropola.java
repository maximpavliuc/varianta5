package nagit;

public class Metropola extends Oras {
    private String numeMetropola;

    public Metropola(String nume, int populatie, String numeRegiune, String numeOras, String numeMetropola) {
        super(nume, populatie, numeRegiune, numeOras);
        this.numeMetropola = numeMetropola;
    }

    public String getNumeMetropola() {
        return numeMetropola;
    }

    public void setNumeMetropola(String numeMetropola) {
        this.numeMetropola = numeMetropola;
    }

    public String toString() {
        return "Metropola " + numeMetropola + " se afla in orasul " + getNumeOras() + " care se afla in regiunea " + getNumeRegiune() + " si contine satul " + getNume() + " cu o populatie de " + getPopulatie() + " locuitori.";
    }
}
