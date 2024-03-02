package nagit;

public class Oras extends Regiune {
    private String numeOras;

    public Oras(String nume, int populatie, String numeRegiune, String numeOras) {
        super(nume, populatie, numeRegiune);
        this.numeOras = numeOras;
    }

    public String getNumeOras() {
        return numeOras;
    }

    public void setNumeOras(String numeOras) {
        this.numeOras = numeOras;
    }

    public String toString() {
        return "Orasul " + numeOras + " se afla in regiunea " + getNumeRegiune() + " si contine satul " + getNume() + " cu o populatie de " + getPopulatie() + " locuitori.";
    }
}
