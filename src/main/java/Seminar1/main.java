package Seminar1;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");

        Dog dog = new Dog("Bobik",new Chumka("Chumka"), "Petr",
        LocalDate.of(3,12,12));
        Dog dog1 = new Dog("Belka",new Chumka("aerophobia"),"Korolev" ,LocalDate.of(1960,8,19));

        Duck duck =new Duck();

        Fish fish = new Fish();

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        cat.liveCycle();
        dog.breathe();
        System.out.println("-------------------\nHomework\n-------------------");

        fish.toGo();
        dog.fly();
        dog1.fly();
        cat.fly();
        duck.fly();
    }
}
