package zadatak10;

/**
 * Created by osman on 5/27/17.
 */
public class Osoba {
    private String ime;
    private String prezime;
    private int godine;
    private String mjesto_boravka;

    public Osoba(String ime, String prezime, int godine, String mjesto_boravka) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.mjesto_boravka = mjesto_boravka;
    }

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

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public String getMjesto_boravka() {
        return mjesto_boravka;
    }

    public void setMjesto_boravka(String mjesto_boravka) {
        this.mjesto_boravka = mjesto_boravka;
    }
}
