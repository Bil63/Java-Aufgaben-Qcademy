package de.qcademy.opp3;

public class Auto {

    private String kennzeichen;
    private int postion;
    private Auto next;

    public Auto(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        this.postion = 0;
        this.next = null;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getPostion() {
        return postion;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }

    public Auto getNext() {
        return next;
    }

    public void setNext(Auto next) {
        this.next = next;
    }
}
