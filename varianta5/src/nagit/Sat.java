package nagit;

public class Sat {
    private String nume;
    private int populatie;

    public Sat(String nume, int populatie) {
        this.nume = nume;
        this.populatie = populatie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPopulatie() {
        return populatie;
    }

    public void setPopulatie(int populatie) {
        this.populatie = populatie;
    }

    public String toString() {
        return "Satul " + nume + " are o populatie de " + populatie + " locuitori.";
    }
}
