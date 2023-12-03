package Seminar2;


public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");

        Dog dog = new Dog();
        dog.setName("Bobik");

        Fish fish = new Fish();
        fish.setName("Nemo");

        Duck duck =new Duck();
        duck.setName("Donald");

        Parrot parrot = new Parrot();
        parrot.setName("Kesha");

        Doctor doctor1 = new Doctor("Aibolit", "Therapist", 03, "Teresa" );
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
