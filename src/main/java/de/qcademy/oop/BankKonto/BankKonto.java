package de.qcademy.oop.BankKonto;

public class BankKonto {

    private static final double LIMIT = 1000.0;

    private String name;
    private String nachname;
    private String kontonummer;
    private double kontostand;


    BankKonto(String name, String nachname, String kontonummer, double kontostand) {
        this.name = name;
        this.nachname = nachname;
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;

    }



    public void einzahlung(double Betrag) {
        if (Betrag > 0) {
            this.kontostand += Betrag;
            System.out.println("Sie haben den Betrag: " + Betrag + " € in Ihrem Konto eingetzalt!");
            System.out.println("kontostand: " + kontostand + " €");
        } else {
            System.out.println("Ungültiger Betrag für die Einzahlung ");
        }
    }
    public void auszahlung(double Betrag1) {
        if (Betrag1 > 0) {

            if (Betrag1 <= LIMIT) {
                this.kontostand -= Betrag1;
                System.out.println("Auszahlung von: " + Betrag1 + " €");
                System.out.println("Kontostand: " + kontostand + " €");
            } else {
                System.out.println("Auszahlung nicht möglich!");
            }
        } else {
            System.out.println("Ungültiger Betrag!");
        }
    }
    public double getKontostand() {
        return kontostand;
    }

    public String toString() {
        return "Kontoinhaber: " + name + " " + nachname + " Kontonummer: " + kontonummer + " " + "Kontostand: " + kontostand + " €";
    }
}

