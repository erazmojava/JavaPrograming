package Zadatak14;

/**
 * Created by FSC on 31.5.2017.
 */
public class Kvadrat extends Tacka {

    private double Stranica;
    private double Dijagonala;
    private double Obim;
    private double Povrsina;


    public Kvadrat(double xOsa, double yOsa, double stranica, double dijagonala, double obim, double povrsina) {
        super(xOsa, yOsa);
        Stranica = stranica;
        Dijagonala = dijagonala;
        Obim = obim;
        Povrsina = povrsina;
    }

    public double getStranica() {
        return Stranica;
    }

    public void setStranica(double stranica) {
        Stranica = stranica;
    }

    public double getDijagonala() {
        return Dijagonala;
    }

    public void setDijagonala(double dijagonala) {
        Dijagonala = dijagonala;
    }

    public double getObim() {
        return Obim;
    }

    public void setObim(double obim) {
        Obim = obim;
    }

    public double getPovrsina() {
        return Povrsina;
    }

    public void setPovrsina(double povrsina) {
        Povrsina = povrsina;
    }
}
