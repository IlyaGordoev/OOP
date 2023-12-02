package Seminar1;

public class Illness {
    public String illnessName;

    public  Illness(String illnessName){
        this.illnessName = illnessName;
    }
    public void heal(){
        System.out.println("drink water whith paracetamol");
    }

    @Override
    public String toString() {
        return illnessName;
    }
}
