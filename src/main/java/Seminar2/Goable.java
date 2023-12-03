package Seminar2;

public interface Goable {
    public static final String type = "Goable";

    default void run() {
        System.out.println(getClass().getSimpleName()+ " run");
    }

    default double getRunSpeed(){
        return 5.5;
    }

}
