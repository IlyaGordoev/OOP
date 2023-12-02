package Seminar1;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " no fly");
    }
}
