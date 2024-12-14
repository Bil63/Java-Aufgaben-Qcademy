package de.qcademy.oop2;

public class Firma {

    private String name;
    private String adresse;
    private int kapazitaet;
    private final Raum[] rooms;
    private int roomsAdded;

    public Firma(String name, String adresse, int kapazitaet) {
        this.name = name;
        this.adresse = adresse;
        this.kapazitaet = kapazitaet;
        this.rooms = new Raum[kapazitaet];
    }
    public int getFreieRaum() {
        int count = 0;
        for (Raum r : rooms) {
            if (!r.isBooked()) {
                count++;
            }
        }
        return count;
    }


    public Raum findeRaumBeiPlatzNummer(int platzNummer) {
        Raum result = null;
        for (Raum r : rooms) {
            if (r.getPlatzNummer() == platzNummer) {
                result = r;
            }
        }
        return result;
    }


    public void setName(String name) {
        this.name = name;
        this.adresse = adresse;
    }

    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    public void raumHinzufuegenBeiPlatz(int i) {

    }

    public void RaumHinzufuegen(Raum bookedRaum) {

    }
}



