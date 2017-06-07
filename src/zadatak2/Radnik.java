package zadatak2;

/**
 * Created by osman on 5/8/17.
 */
public class Radnik {
    public String ime;
    protected String prezime;
    private double plata;
    private int godine;

    //Konstruktor nema povratni tip, Ime konstruktora mora da bude kao i ime klase
    //Konstruktor mora da bude uvijek public
    // Konstruktor koji prima dva parametra
    public Radnik(String ime, String prezime, double plata, int godine) {
        //tis scope klase, u ovom primjeru scope su privatni clanovi klase(ime, prezime, plata)
        this.ime = ime;
        this.prezime = prezime;
        this.plata = plata;
        this.godine = godine;
    }
    // Default konstruktor(ne prima nista)
    public Radnik(){}

    //metod za dohvatanje ime
    public String getIme() {
        return this.ime;
    }

    //metod koji postavlja ime(uvijek je povratni tip void)
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    protected double getPlata() {
        return this.plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getGodine() {
        return this.godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }
}
