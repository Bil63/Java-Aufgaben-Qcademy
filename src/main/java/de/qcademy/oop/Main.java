package de.qcademy.oop;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person max = new Person("Max", "M", 80.0, LocalDate.of(1991, 03, 15));
        System.out.println("Name: " + max);

        System.out.println("Das Alter von Max ist " + max.alter());
    }
}
