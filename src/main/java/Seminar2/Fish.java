package Seminar2;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}