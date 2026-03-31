package HospitalManagementSystem;

public interface HospitalService {
    void addPatient(Patient p);
    void removePatient(int id);
    void bookAppointment(Appointment a) throws AppointmentNotAvailableException;
    void cancelAppointment(Appointment a);
}

