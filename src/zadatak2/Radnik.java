package zadatak2;

/**
 * Created by osman on 5/8/17.
 */
public class Radnik {
    private String ime;
    private String prezime;
    private double plata;
    private int godine;

    public Radnik(String ime, String prezime, double plata, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.plata = plata;
        this.godine = godine;
    }

    public Radnik(){}

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }
}
