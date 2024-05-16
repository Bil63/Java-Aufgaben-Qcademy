package de.qcademy.oop2;

public class Raum {


    private int platzNumber;
    private boolean booked;

    public Raum (int platzNummer) {
        this.platzNumber = platzNummer;
    }
    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public int getPlatzNummer() {
        return platzNumber;
    }

    public void setPlatzNummer(int platzNummer) {
        this.platzNumber = platzNummer;
    }

    public boolean isBooked() {
        return booked;
    }

    @Override
    public String toString() {
        return "Raum{" +
                "platzNummer=" + platzNumber +
                ", booked=" + booked +
                '}';
    }
}
