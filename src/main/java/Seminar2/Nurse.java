package Seminar2;

public class Nurse extends Personal{
    public Nurse() {
    }
    public Nurse(String name, String specialty, int telephone) {
        super(name, specialty, telephone);
    }
    public void injections(){
        System.out.println(getClass().getSimpleName() + " " + getName() + " injections");
    }
    public void bandage(){
        System.out.println(getClass().getSimpleName() + " " + getName() + " bandage");
    }
}
