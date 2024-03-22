package de.qcademy.opp3;

public class Warteschlange {

    private Auto first;
    private int maximaleKapazitaet;
    private int size;



    public Warteschlange(int maximaleKapazitaet) {

        this.maximaleKapazitaet = maximaleKapazitaet;
        this.size = 0;
    }

    public void autohinzufuegen(Auto wagen) {
        if (size < maximaleKapazitaet) {
            if (first == null) {
                first = wagen;
            } else {
                Auto current = first;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(wagen);
            }
            wagen.setPostion(++size);
        }
    }


}
