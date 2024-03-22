package de.qcademy.oop2;

public class Buch{

    public String titel;
    public String isbn;
    public double preis;
    public Autor autor;

    Buch(String titel, String isbn, Autor autor) {
        this.titel = titel;
        this.isbn = isbn;
        this.autor = autor;
    }
    public String toString() {
        return "Buch: " + titel + "ISBN: " + isbn + " Preis: " + preis + "\n" + autor.toString();
    }
}


