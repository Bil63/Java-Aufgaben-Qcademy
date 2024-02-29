package de.qcademy.oop.Auto;

public class Auto {

    private String kfzKennzeichen;
    private double kilometerstand;
    private double tankvolumen;
    private double kraftstoffVerbrauch;
    private double kraftstoffmenge;

    Auto(String kfzKennzeichen, double kilometerstand, double tankvolumen, double kraftstoffVerbrauch, double kraftstoffmenge) {
        this.kfzKennzeichen = kfzKennzeichen;
        this.kilometerstand = kilometerstand;
        this.tankvolumen = tankvolumen;
        this.kraftstoffVerbrauch = kraftstoffVerbrauch;
        this.kraftstoffmenge = kraftstoffmenge;
    }

    Auto() {

    }


    public void tanken (double menge) {

        this.kraftstoffmenge +=menge;
    }
    public void fahren (double strecke) {
        double verbrauch = strecke / this.kraftstoffmenge;
        if (verbrauch <= this.kraftstoffmenge) {
            this.kilometerstand += strecke;
            this.kraftstoffmenge -= verbrauch;
            System.out.println("Neue Kilometerstand " + this.kilometerstand);
        } else {
            System.out.println("Auto hat nicht genug Kraftstoff, tanken sie zuerst");
        }

    }

    public String getKfzKennzeichen() {
        return this.kfzKennzeichen;
    }
    public double getKilometerstand() {
        return this.kilometerstand;
    }
    public double getTankvolumen() {
        return this.tankvolumen;
    }


}
