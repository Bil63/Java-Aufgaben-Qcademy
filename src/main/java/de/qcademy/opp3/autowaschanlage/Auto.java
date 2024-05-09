package de.qcademy.opp3.autowaschanlage;

import java.time.LocalDateTime;
import java.util.Objects;

public class Auto {

    public Auto next;
    public Auto previous;
    private String kennzeichen;
    private String marke;
    private String modell;
    private LocalDateTime ankunftszeit;



    Auto(String kennzeichen, String marke, String modell, LocalDateTime ankunftszeit) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.ankunftszeit = ankunftszeit;
    }


    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public LocalDateTime getAnkunftszeit() {
        return ankunftszeit;
    }

    public static void main(String[] args) {
        Warteschlange schlange = new Warteschlange();
        //Autos erstellen
        Auto auto1 = new Auto("HD AB 12345", "Audi", "A5", LocalDateTime.now());

        Auto auto2 = new Auto("HD XX 55865", "VW", "Golf", LocalDateTime.now());

        schlange.autoHinzufuegen(auto1);
        schlange.autoHinzufuegen(auto2);

        System.out.println("Autos in der Schlange");
        Auto current = schlange.head;
        while (current != null) {
            System.out.println(current.kennzeichen);
            current = current.next;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(kennzeichen, auto.kennzeichen) && Objects.equals(marke, auto.marke) && Objects.equals(modell, auto.modell) && Objects.equals(ankunftszeit, auto.ankunftszeit) && Objects.equals(next, auto.next) && Objects.equals(previous, auto.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kennzeichen, marke, modell, ankunftszeit, next, previous);
    }

}

