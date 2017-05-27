package zadatak10;

import java.util.Date;

/**
 * Created by osman on 5/27/17.
 */
public class Cips {
    private Osoba osoba;
    private String opstina;
    private Date datum;
    private String mesto_opstine;

    public Cips(Osoba osoba, String opstina, Date datum, String mesto_opstine) {
        this.osoba = osoba;
        this.opstina = opstina;
        this.datum = datum;
        this.mesto_opstine = mesto_opstine;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public String getOpstina() {
        return opstina;
    }

    public void setOpstina(String opstina) {
        this.opstina = opstina;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getMesto_opstine() {
        return mesto_opstine;
    }

    public void setMesto_opstine(String mesto_opstine) {
        this.mesto_opstine = mesto_opstine;
    }
}