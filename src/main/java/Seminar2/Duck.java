package Seminar2;

import java.time.LocalDate;

public class Duck extends Animal implements Swimable, Flyable, Goable, Speakble{
    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName() + " " + getName() + "quack, quack, quack");
    }
}
