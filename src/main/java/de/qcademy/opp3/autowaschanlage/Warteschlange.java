package de.qcademy.opp3.autowaschanlage;

public class Warteschlange {
    private int groesse;
    private int kapazitaet;
    public Auto head;
    private Auto tail;

    Warteschlange() {
        this.kapazitaet = 10;
    }
    public void autoHinzufuegen(Auto auto) {
        if (this.groesse == kapazitaet) {
            System.out.println("Maximale Anzahl von Autos erreicht! Anlage voll");
            return;
        }
        if (this.groesse == 0) {
            this.head = auto;
            this.tail = auto;
            this.groesse++;
            return;
        }
        auto.next = this.head;
        this.head.previous = auto;
        this.head = auto;
        this.groesse++;
    }
    public void autoEntfernen() {
        if (this.groesse == 0) {
            System.out.println("Warteschlange leer!");
            return;
        }
        if (this.tail != null) {
            this.tail = this.tail.previous;
            if (this.tail != null) {
                this.tail.next = null;
            } else {
                this.head = null;
            }
            this.groesse--;
        }
    }
    public void nachHauseFahren(Auto auto) {
        if (auto == null || groesse ==0)
        return;
        if (auto.equals(this.tail)) {
            autoEntfernen();
        } else if (auto.equals(this.head)) {
            this.head = auto.next;
            if (this.head != null) {
                this.head.previous = null;
            } else {
                this.tail = null;
            }
            auto.next = null;
            this.groesse--;
        } else {
            Auto cursor = this.head.next;
            while (cursor != null) {
                if (cursor.equals(auto)) {
                    cursor.previous.next = auto.next;
                    if (auto.next != null) {
                        auto.next.previous = auto.previous;
                    }
                    auto.next = null;
                    auto.previous = null;
                    this.groesse--;
                    break;
                }
                cursor = cursor.next;
            }
        }

    }

}

