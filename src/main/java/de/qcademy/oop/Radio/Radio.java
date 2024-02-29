package de.qcademy.oop.Radio;

public class Radio {

    private boolean eingeschaltet;
    private int lautstaerke;
    private double frequenz;

    Radio() {
        this.eingeschaltet = false;
        this.lautstaerke = 0;
        this.frequenz = 99.9;
    }

    private Radio(boolean istAN, int lautstaerke, double frequenz) {
        this.eingeschaltet = istAN;
        this.lautstaerke = lautstaerke;
        if (frequenz > 85.0 || frequenz < 110.0) {
            this.frequenz = 99.9;
        } else {
            this.frequenz = frequenz;
        }
    }

    public void lauter() {
        if(eingeschaltet && lautstaerke < 10) {
            lautstaerke++;
        }
    }
    public void leiser() {
        if (eingeschaltet && lautstaerke > 0) {
            lautstaerke--;
        }
    }
    public void an() {
        eingeschaltet = true;
    }

    public void aus() {
        eingeschaltet = false;
    }
    public String toString() {
        return "Radio " + (eingeschaltet ? "an " : "aus ") + "Freq: " + frequenz + " laut: " +lautstaerke;
    }

    public void waehleSender(double frequenz) {
        if (frequenz < 85.0 || frequenz > 110.0) {
            this.frequenz = 99.9;
        } else {
            this.frequenz = frequenz;
        }
    }
}
