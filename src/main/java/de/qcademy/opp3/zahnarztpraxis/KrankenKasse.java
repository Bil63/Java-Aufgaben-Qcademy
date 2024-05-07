package de.qcademy.opp3.zahnarztpraxis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KrankenKasse {

    private int kassennummer;
    private String kassenName;
    private List<Patient> patienten;

    KrankenKasse(int kassennummer, String kassenName) {
    this.kassennummer = kassennummer;
    this.kassenName = kassenName;
    this.patienten = new ArrayList<>();
    }


    public int getKassennummer() {
        return kassennummer;
    }

    public String getKassenName() {
        return kassenName;
    }

    public void addPatient(Patient patient) {
        patienten.add(patient);
    }

    public void removePatient(Patient patient) {
        patienten.remove(patient);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KrankenKasse that = (KrankenKasse) o;
        return kassennummer == that.kassennummer && Objects.equals(kassenName, that.kassenName) && Objects.equals(patienten, that.patienten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kassennummer, kassenName, patienten);
    }
}
