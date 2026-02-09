package dao;

import model.Patient;
import util.DbConnection;
import java.sql.*;

public class PatientDao {

    // UC-1.1 Register Patient
    public boolean registerPatient(Patient patient) throws Exception {
        Connection con = DbConnection.getConnection();

        String checkSql = "SELECT * FROM patients WHERE contact=?";
        PreparedStatement check = con.prepareStatement(checkSql);
        check.setString(1, patient.getContact());

        ResultSet rs = check.executeQuery();
        if (rs.next()) return false;

        String sql = "INSERT INTO patients(name,dob,contact,address,blood_group) VALUES(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, patient.getName());
        ps.setString(2, patient.getDob());
        ps.setString(3, patient.getContact());
        ps.setString(4, patient.getAddress());
        ps.setString(5, patient.getBloodGroup());

        ps.executeUpdate();
        return true;
    }

    // UC-1.2 Update Patient
    public boolean updatePatient(int id, String address, String bloodGroup) throws Exception {
        Connection con = DbConnection.getConnection();

        String sql = "UPDATE patients SET address=?, blood_group=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, address);
        ps.setString(2, bloodGroup);
        ps.setInt(3, id);

        return ps.executeUpdate() > 0;
    }

    // UC-1.3 Search Patient
    public void searchPatient(String keyword) throws Exception {
        Connection con = DbConnection.getConnection();

        String sql = "SELECT * FROM patients WHERE name LIKE ? OR contact=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "%" + keyword + "%");
        ps.setString(2, keyword);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " | " +
                rs.getString("name") + " | " +
                rs.getString("contact") + " | " +
                rs.getString("blood_group")
            );
        }
    }

    // UC-1.4 View Visit History
    public void viewVisitHistory(int patientId) throws Exception {
        Connection con = DbConnection.getConnection();

        String sql = """
            SELECT a.date, d.name AS doctor, v.diagnosis
            FROM appointments a
            JOIN visits v ON a.id = v.appointment_id
            JOIN doctors d ON a.doctor_id = d.id
            WHERE a.patient_id = ?
            ORDER BY a.date
            """;

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, patientId);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                rs.getString("date") + " | " +
                rs.getString("doctor") + " | " +
                rs.getString("diagnosis")
            );
        }
    }
}

