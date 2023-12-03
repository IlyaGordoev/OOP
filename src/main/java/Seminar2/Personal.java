package Seminar2;

public class Personal {
    protected String name;
    private String specialty;
    private int telephone;

    public Personal(){
    }
    public Personal(String name, String specialty, int telephone) {
        this.name = name;
        this.specialty = specialty;
        this.telephone = telephone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", specialty=" + specialty +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
