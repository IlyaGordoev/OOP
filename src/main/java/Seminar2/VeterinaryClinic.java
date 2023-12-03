package Seminar2;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private List<Personal> personal = new ArrayList<>();

    public List<Animal> getPatients(){
        return patients;
    }
    public List<Personal> getPersonal(){
        return personal;
    }

    public VeterinaryClinic addPatient(Animal patient){
        patients.add(patient);
        return this;
    }
    public VeterinaryClinic addStaff(Personal staff){
        personal.add(staff);
        return this;
    }

    public List<Goable> getGoable(){
        System.out.println("Goable's list");
        List<Goable> result = new ArrayList<>();
        for (Animal animal: patients){
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }
    public List<Swimable> getSwimable(){
        System.out.println("Swimable's list");
        List<Swimable> result = new ArrayList<>();
        for (Animal animal: patients){
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }
    public List<Flyable> getFlyable(){
        System.out.println("Flyable's list");
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: patients){
            if (animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }
    public List<Speakble> getSpeakble(){
        System.out.println("Speakble's list");
        List<Speakble> result = new ArrayList<>();
        for (Animal animal: patients){
            if (animal instanceof Speakble){
                result.add((Speakble) animal);
            }
        }
        return result;
    }
    public List<Personal> getDoctorList(){
        System.out.println("Doctor's list");
        List<Personal> result = new ArrayList<>();
        for (Personal staff: personal){
            if (staff.getClass() == Doctor.class){
                result.add((Personal) staff);
            }
        }
        return result;
    }
    public List<Personal> getNurseList(){
        System.out.println("Nurse's list");
        List<Personal> result = new ArrayList<>();
        for (Personal staff: personal){
            if (staff.getClass() == Nurse.class){
                result.add((Personal) staff);
            }
        }
        return result;
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    }
}
