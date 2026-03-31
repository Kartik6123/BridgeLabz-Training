package HospitalManagementSystem;

import java.util.*;

public class HospitalServiceImplementation implements HospitalService {

    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void removePatient(int id) {
        patients.removeIf(p -> p.getId() == id);
    }

    public void bookAppointment(Appointment a) throws AppointmentNotAvailableException {
        for (Appointment ap : appointments) {
            if (ap.getDoctor().getId() == a.getDoctor().getId() &&
                ap.getDate().equals(a.getDate())) {
                throw new AppointmentNotAvailableException("Doctor not available");
            }
        }
        appointments.add(a);
    }

    public void cancelAppointment(Appointment a) {
        appointments.remove(a);
    }
}
