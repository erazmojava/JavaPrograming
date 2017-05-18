package zadatak6;

/**
 * Created by osman on 5/15/17.
 */
public class Pravougaonik {
    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Pravougaonik(){}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double getObim(){
        return (this.a+this.b) * 2;
    }
    public double getPovrsina(){
        return this.a+this.b;
    }
    public double getDiagonala() {
        return Math.sqrt(this.a * this.a + this.b * this.b);
    }
}
