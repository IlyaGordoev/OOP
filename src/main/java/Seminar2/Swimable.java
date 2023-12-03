package Seminar2;

public interface Swimable {
    default void swim(){
        System.out.println(getClass().getSimpleName()+ " swam");
    }
    default double getSwimSpeed(){
        return 5.5;
    }
}
