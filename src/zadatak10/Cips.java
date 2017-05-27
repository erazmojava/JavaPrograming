package zadatak10;

import java.util.Date;

/**
 * Created by FSC on 27.5.2017.
 */
public class Cips {

private Osoba osoba;
    private String mjesto_opstine;
    private Date datum;
    private String opstina;

    public Cips(Osoba osoba, String mjesto_opstine, Date datum, String opstina) {
        this.osoba = osoba;
        this.mjesto_opstine = mjesto_opstine;
        this.datum = datum;
        this.opstina = opstina;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public String getMjesto_opstine() {
        return mjesto_opstine;
    }

    public void setMjesto_opstine(String mjesto_opstine) {
        this.mjesto_opstine = mjesto_opstine;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getOpstina() {
        return opstina;
    }

    public void setOpstina(String opstina) {
        this.opstina = opstina;
    }
}
