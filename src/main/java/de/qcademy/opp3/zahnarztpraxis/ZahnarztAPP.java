package de.qcademy.opp3.zahnarztpraxis;

import java.util.Date;

public class ZahnarztAPP {

    public static void main(String[] args) {

        //Erstellung 2 Krankenkassen
        KrankenKasse kasse1 = new KrankenKasse(12345, "Techniker");
        KrankenKasse kasse2 = new KrankenKasse(25446, "IKK");

        //Erstellung 2 Patienten
        Patient patient1;
        patient1 = new Patient(3245, "Max", "Musterweg 4",
                new Date(1995, 5, 15), "Max", true,kasse2);
        Patient patient2 = new Patient(8978, "Anna M", "Musterstraße 25",
                new Date(2003, 4, 20), "Anna", true, kasse1);

        System.out.println(patient1);
        System.out.println(patient2);
    }
}
