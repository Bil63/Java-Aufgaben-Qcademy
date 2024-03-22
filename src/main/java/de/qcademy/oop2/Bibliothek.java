package de.qcademy.oop2;

public class Bibliothek {

    private Buch ausgeliehenesBuch;
    public void buchHinzufuegen(Buch buch) {
        System.out.println("Buch hinzugefügt " + buch.titel);
    }

    public void buchAusleihen(Buch buch) {
        this.ausgeliehenesBuch = buch;
        System.out.println("Buch ausgeliehen " + buch.titel);
    }

    public void buchZurueckgeben(Buch buch) {
        if (this.ausgeliehenesBuch != null && this.ausgeliehenesBuch.equals(buch)) {
            this.ausgeliehenesBuch = null;
            System.out.println("Buch zurückgegeben " + buch.titel);
        } else {
            System.out.println("Das Buch wurde nicht ausgeliehen! ");
        }
    }

    public void buchloeschen(Buch buch) {
        System.out.println("Buch gelöscht! " + buch.titel);
    }
}
