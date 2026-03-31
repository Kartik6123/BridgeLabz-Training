import java.util.*;
import java.util.function.Predicate;

class Alert {
    private String message;
    private String type;
    private boolean critical;

    public Alert(String message, String type, boolean critical) {
        this.message = message;
        this.type = type;
        this.critical = critical;
    }

    public String getType() {
        return type;
    }

    public boolean isCritical() {
        return critical;
    }

    @Override
    public String toString() {
        return message + " | Type: " + type + " | Critical: " + critical;
    }
}

public class HospitalAlertSystem {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("Heart rate high", "Health", true),
            new Alert("Appointment reminder", "Reminder", false),
            new Alert("Medicine time", "Reminder", true),
            new Alert("Lab report available", "Report", false)
        );

        // User preference: show only critical alerts
        Predicate<Alert> criticalAlerts =
            alert -> alert.isCritical();

        // User preference: show only reminder alerts
        Predicate<Alert> reminderAlerts =
            alert -> alert.getType().equals("Reminder");

        System.out.println("Critical Alerts:");
        alerts.stream()
              .filter(criticalAlerts)
              .forEach(System.out::println);

        System.out.println();

        System.out.println("Reminder Alerts:");
        alerts.stream()
              .filter(reminderAlerts)
              .forEach(System.out::println);
    }
}
