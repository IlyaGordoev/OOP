package Seminar2;

public class Doctor extends Personal{
    String nurse;

    public Doctor() {
    }
    public Doctor(String name, String specialty, int telephone, String nurse) {
        super(name, specialty, telephone);
        this.nurse = nurse;
    }
    public void counseling(){
        System.out.println(getClass().getSimpleName() + " " + getName() + " counseling");
    }
    public void treatment(){
        System.out.println(getClass().getSimpleName() + " " + getName() + " treatment");
    }
}
