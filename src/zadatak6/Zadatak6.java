package zadatak6;

public class Zadatak6 {

    public static void main(String[] args) {
        //kriramo objekat pravougaonik i dodijelimo mu stranicu a i b preko konstruktora
        Pravougaonik pravougaonik = new Pravougaonik(10,5);
        System.out.println("Obim pravougaonika je: "+pravougaonik.getObim());
        System.out.println("Povrsina pravougaonika je: "+pravougaonik.getPovrsina());
        System.out.println("Diagonala pravougaonika je: "+pravougaonik.getDiagonala());
    }

}