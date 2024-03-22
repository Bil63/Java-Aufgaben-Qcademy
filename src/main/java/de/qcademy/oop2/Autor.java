package de.qcademy.oop2;

public class Autor {

        public String name;
        public String synonym;
        public double gage;
        public Autor(String name) {
            this.name = name;
        }

        public String toString() {
            return "Autor: " + name + " Synonym: " + synonym + " Gage: " + gage;
        }
}
