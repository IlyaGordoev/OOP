package Seminar2;

public interface Flyable {
    default void fly(){
        System.out.println(getClass().getSimpleName()+ " flew");
    }
    default double getFlySpeed(){
        return 5.5;
    }
}
