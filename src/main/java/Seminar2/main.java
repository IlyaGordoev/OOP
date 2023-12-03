package Seminar2;


import Seminar1.Chumka;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik",new Illness("Allergy"), "Petr", LocalDate.of(2020,10,10));
        Dog dog = new Dog("Belka",new Illness("Aerophobia"),"Korolev" ,LocalDate.of(1960,8,19));
        Fish fish = new Fish("Nemo",new Illness("Allergy"), "Jules Verne", LocalDate.of(1802,1,1));
        Duck duck =new Duck("Donald",new Illness("Post-traumatic stress disorder"), "Walt", LocalDate.of(1934,1,1));
        Parrot parrot = new Parrot("Kesha",new Illness("Smoking-related illnesses!"), "Petr", LocalDate.of(1984,1,1));

        Doctor doctor1 = new Doctor("Aibolit", "Therapist", 112, "Teresa" );
        Doctor doctor2 = new Doctor("House", "Diagnostician", 911, "Teresa" );

        Nurse nurse = new Nurse("Teresa", "Nurse", 112);

        VeterinaryClinic patients = new VeterinaryClinic();
        patients.addPatient(cat).addPatient(dog).addPatient(duck).addPatient(fish).addPatient(parrot);

        VeterinaryClinic personal = new VeterinaryClinic();
        personal.addStaff(doctor1).addStaff(doctor2).addStaff(nurse);

        System.out.println("-----Patients-----");
        System.out.println(patients.getPatients());
        System.out.println(patients.getSpeakble());
        System.out.println(patients.getSwimable());
        System.out.println(patients.getFlyable());
        System.out.println(patients.getGoable());
        System.out.println("\n");

        System.out.println("-----Personal-----");
        System.out.println(personal.getPersonal());
        System.out.println(personal.getDoctorList());
        System.out.println(personal.getNurseList());
        System.out.println("------------------");

    }
}
