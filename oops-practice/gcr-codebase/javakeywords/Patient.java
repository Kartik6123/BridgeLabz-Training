package javakeywords;
public class Patient {
    static String hospitalName;
    String patientName;
    int age;
    String ailment;
    final int patientId;
    static int totalPatients;
    static void getTotalPatients() {
        // static method
        System.out.println("Hospital: " + hospitalName + ", Total Patients: " + totalPatients);
    }
    Patient(String patientName, int age, String ailment, int patientId) {
        // constructor
        this.patientName = patientName;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatients++;
    }
    void displayPatientDetails() {
        // instance method
        if(this instanceof Patient){
            // using 'this' keyword
            System.out.println("Name: " + patientName + ", Age: " + age +
                               ", Ailment: " + ailment + ", Patient ID: " + patientId);
        }
    }
    public static void main(String[] args) {
        Patient.hospitalName = "City Hospital";

        Patient patient1 = new Patient("Emma Brown", 30, "Flu", 301);
        Patient patient2 = new Patient("Liam Wilson", 45, "Fracture", 302);

        Patient.getTotalPatients();
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
    }
}
