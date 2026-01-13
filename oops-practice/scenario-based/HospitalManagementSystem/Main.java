package HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {

        HospitalService service = new HospitalServiceImplementation();

        Patient p1 = new Patient(1, "Kartik");
        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiology");

        service.addPatient(p1);

        Appointment a1 = new Appointment(p1, d1, "12-01-2026");

        try {
            service.bookAppointment(a1);
            System.out.println("Appointment booked");
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Consultation Fee: " + d1.calculateFee());
    }
}

