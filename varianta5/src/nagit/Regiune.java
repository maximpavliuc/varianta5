package nagit;

public class Regiune extends Sat {
    private String numeRegiune;

    public Regiune(String nume, int populatie, String numeRegiune) {
        super(nume, populatie);
        this.numeRegiune = numeRegiune;
    }

    public String getNumeRegiune() {
        return numeRegiune;
    }

    public void setNumeRegiune(String numeRegiune) {
        this.numeRegiune = numeRegiune;
    }

    public String toString() {
        return "Regiunea " + numeRegiune + " contine satul " + getNume() + " cu o populatie de " + getPopulatie() + " locuitori.";
    }
}
