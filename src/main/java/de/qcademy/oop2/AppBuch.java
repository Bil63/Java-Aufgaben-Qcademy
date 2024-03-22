package de.qcademy.oop2;

import java.util.Scanner;

public class AppBuch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Buch buch = null;

        while (true) {
            System.out.println("Bitte geben Sie den Titel des Buchs ein: ");
            String titel = scanner.nextLine();

            System.out.println("Bitte geben Sie ISBN des Buchs ein: ");
            String isbn = scanner.nextLine();

            System.out.println("Bitte geben Sie den Namen des Autor ein: ");
            String autorName = scanner.nextLine();

            Autor autor = new Autor(autorName);

            System.out.println("Bitte geben Sie den Preis des Buchs ein: ");
            double preis = Double.parseDouble(scanner.nextLine());

            buch = new Buch(titel, isbn, autor);
            buch.preis = preis;

            System.out.println("Buch " + buch.titel + " erzeugt.");
            System.out.println(buch.toString());

        }

        /*Autor autor1 = new Autor("Robert Greene ");
        autor1.synonym = "Robert Greene ";
        autor1.gage = 1000.0;

        Autor autor2 = new Autor("Thomas Klußmann  ");
        autor2.synonym = "Thomas Klußmann ";
        autor2.gage = 1500.0;

        Autor autor3 = new Autor("Davis Goggins ");
        autor3.synonym = "Davis Goggins ";
        autor3.gage = 2000.0;

        Buch buch1 = new Buch("Power ", "9781861972781", autor1);
        buch1.preis = 20.00;

        Buch buch2 = new Buch("Kickstart ", "978394747106", autor2);
        buch2.preis = 17.99;

        Buch buch3 = new Buch("Can´t hurt me ", "97815544512273", autor3);
        buch3.preis = 25.00;


        System.out.println(buch1.toString());
        System.out.println(buch2.toString());
        System.out.println(buch3.toString());*/

    }
}
