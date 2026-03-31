package pillarsofoops;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {

    // Basic patient details
    private String patientId;
    private String name;
    private int age;

    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Billing differs for each patient type
    abstract double calculateBill();

    // Common method for all patients
    void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {

    // Sensitive data kept private
    private String diagnosis;
    private int daysAdmitted;
    private String medicalHistory;

    InPatient(String patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    double calculateBill() {
        return daysAdmitted * 2000;
    }

    public void addRecord(String record) {
        this.medicalHistory = record;
    }

    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}

class OutPatient extends Patient implements MedicalRecord {

    private String diagnosis;
    private String medicalHistory;

    OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    double calculateBill() {
        return 500;
    }

    public void addRecord(String record) {
        this.medicalHistory = record;
    }

    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}

class Main {

    // Single method handling different patient types
    static void processPatient(Patient p, MedicalRecord m) {
        p.getPatientDetails();
        System.out.println("Total Bill: " + p.calculateBill());
        m.viewRecords();
        System.out.println();
    }

    public static void main(String[] args) {

        InPatient ip = new InPatient("IP101", "Alice", 45, 5);
        ip.setDiagnosis("Pneumonia");
        ip.addRecord("Admitted with breathing issues");

        OutPatient op = new OutPatient("OP201", "Bob", 30);
        op.setDiagnosis("Fever");
        op.addRecord("Prescribed medication");

        processPatient(ip, ip);
        processPatient(op, op);
    }
}
