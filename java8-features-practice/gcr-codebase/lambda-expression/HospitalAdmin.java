import java.util.*;

class Patient {
    private int id;

    public Patient(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class HospitalAdmin {

    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
            new Patient(101),
            new Patient(102),
            new Patient(103),
            new Patient(104)
        );

        // Print all patient IDs using method reference
        patients.stream()
                .map(Patient::getId)
                .forEach(System.out::println);
    }
}
