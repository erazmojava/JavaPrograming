package Zadatak14;

/**
 * Created by FSC on 31.5.2017.
 */
public class Krug extends Tacka{

    private double Poluprecnik;
    private double Obim;
    private double Povrsina;

    public Krug(double xOsa, double yOsa, double poluprecnik, double obim, double povrsina) {
        super(xOsa, yOsa);
        Poluprecnik = poluprecnik;
        Obim = obim;
        Povrsina = povrsina;
    }

    public double getPoluprecnik() {
        return Poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        Poluprecnik = poluprecnik;
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
