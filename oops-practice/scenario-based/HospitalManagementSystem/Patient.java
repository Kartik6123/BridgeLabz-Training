package HospitalManagementSystem;
import java.util.*;

public class Patient extends Person {   
    // Inherits from Person
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int id, String name) {
        super(id, name);
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }
}

