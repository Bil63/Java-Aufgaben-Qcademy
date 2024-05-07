package de.qcademy.opp3.zahnarztpraxis;

import java.util.Date;
import java.util.Objects;

public class Patient {

    private int patientenNummer;
    private String patientenName;
    private String adresse;
    private Date geburtsdatum;
    private String versichrtenName;
    private boolean karteVorgelegt;
    private KrankenKasse krankenKasse;


    Patient(int patientenNummer, String patientenName, String adresse, Date geburtsdatum, String versichrtenName,
            boolean karteVorgelegt, KrankenKasse krankenKasse) {
        this.patientenNummer = patientenNummer;
        this.patientenName = patientenName;
        this.adresse = adresse;
        this.geburtsdatum = geburtsdatum;
        this.versichrtenName =versichrtenName;
        this.karteVorgelegt = karteVorgelegt;
        this.krankenKasse = krankenKasse;
    }


    public int getPatientenNummer() {
        return patientenNummer;
    }

    public String getPatientenName() {
        return patientenName;
    }

    public String getAdresse() {
        return adresse;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getVersichrtenName() {
        return versichrtenName;
    }

    public boolean isKarteVorgelegt() {
        return karteVorgelegt;
    }

    public KrankenKasse getKrankenKasse() {
        return krankenKasse;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return patientenNummer == patient.patientenNummer && karteVorgelegt == patient.karteVorgelegt && Objects.equals(patientenName, patient.patientenName) && Objects.equals(adresse, patient.adresse) && Objects.equals(geburtsdatum, patient.geburtsdatum) && Objects.equals(versichrtenName, patient.versichrtenName) && Objects.equals(krankenKasse, patient.krankenKasse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientenNummer, patientenName, adresse, geburtsdatum, versichrtenName, karteVorgelegt, krankenKasse);
    }
}

