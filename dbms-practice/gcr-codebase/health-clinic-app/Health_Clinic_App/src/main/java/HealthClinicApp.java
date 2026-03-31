import dao.PatientDao;
import model.Patient;
import java.util.Scanner;

public class HealthClinicApp {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PatientDao dao = new PatientDao();

        while (true) {
            System.out.println("\n1.Register Patient");
            System.out.println("2.Update Patient");
            System.out.println("3.Search Patient");
            System.out.println("4.View Visit History");
            System.out.println("5.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter name:");
                    String name = sc.nextLine();

                    System.out.println("Enter DOB:");
                    String dob = sc.nextLine();

                    System.out.println("Enter contact:");
                    String contact = sc.nextLine();

                    System.out.println("Enter address:");
                    String address = sc.nextLine();

                    System.out.println("Enter blood group:");
                    String bg = sc.nextLine();

                    Patient p = new Patient(0, name, dob, contact, address, bg);

                    if (dao.registerPatient(p))
                        System.out.println("Patient Registered Successfully");
                    else
                        System.out.println("Patient already exists");
                    break;

                case 2:
                    System.out.println("Enter patient ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter new address:");
                    String newAddress = sc.nextLine();

                    System.out.println("Enter new blood group:");
                    String newBg = sc.nextLine();

                    if (dao.updatePatient(id, newAddress, newBg))
                        System.out.println("Patient Updated");
                    else
                        System.out.println("Patient not found");
                    break;

                case 3:
                    System.out.println("Enter name or contact:");
                    String keyword = sc.nextLine();
                    dao.searchPatient(keyword);
                    break;

                case 4:
                    System.out.println("Enter patient ID:");
                    int pid = sc.nextInt();
                    dao.viewVisitHistory(pid);
                    break;

                case 5:
                    return;
            }
        }
    }
}
