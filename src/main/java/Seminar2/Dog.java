package Seminar2;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable, Speakble {
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName() + " " + getName() + "woof, woof, woof");
    }
}
