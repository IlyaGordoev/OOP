package Seminar1;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public void fly() {
        if (getName().equals("Belka")) {
            System.out.println(getClass().getSimpleName() + " " + getName() + " flew because of the astranaft");
        }
        else {
            System.out.println(getClass().getSimpleName() + " " + getName() + " only Belka and Strelka fly");
        }
    }
}
