package Seminar1;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");
        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("Chumka"), "Petr",
        LocalDate.of(3,12,12));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCycle();
        dog.brethe();

    }
}
