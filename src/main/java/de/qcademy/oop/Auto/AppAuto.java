package de.qcademy.oop.Auto;

public class AppAuto {

    public static void main(String[] args) {
       Auto audiA5 = new Auto("HD BA 1", 130000, 60, 10, 10);
        Auto audiA4 = new Auto();

        audiA5.fahren(1100);
        audiA5.tanken(50);

        audiA4.fahren(60);
        audiA4.tanken(50);
    }
}
