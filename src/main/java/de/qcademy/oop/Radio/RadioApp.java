package de.qcademy.oop.Radio;

public class RadioApp {

    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.an();
        radio.waehleSender(98.1);
        radio.lauter();
        System.out.println(radio);
        radio.aus();
        System.out.println(radio);
    }
}
