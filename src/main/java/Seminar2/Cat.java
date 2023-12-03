package Seminar2;

import java.time.LocalDate;

public class Cat extends Animal implements Speakble, Goable {
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName() + " " + getName() + "meow, meow, meow");
    }
}
