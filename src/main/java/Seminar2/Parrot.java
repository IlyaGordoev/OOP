package Seminar2;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable, Goable, Speakble{
    public Parrot() {
        super();
    }

    public Parrot(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName() + " " + getName() + "tweet, tweet, tweet");
    }
}