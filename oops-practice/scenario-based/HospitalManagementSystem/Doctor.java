package HospitalManagementSystem;
public class Doctor extends Person {
    // Inherits from Person
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    public double calculateFee() {
        return 500;
    }

    public String getSpecialization() {
        return specialization;
    }
}

