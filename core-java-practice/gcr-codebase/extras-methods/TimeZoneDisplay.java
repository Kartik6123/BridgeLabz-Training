import java.time.ZoneId;
import java.time.ZonedDateTime;
public class TimeZoneDisplay {
    public static void main(String[] args) {
        showTime("GMT", "UTC");
        showTime("IST", "Asia/Kolkata");
        showTime("PST", "America/Los_Angeles");
    }
    // Displays current time for the given time zone
    static void showTime(String name, String id) {
        ZoneId zone = ZoneId.of(id);
        // Creates a ZoneId object
        ZonedDateTime time = ZonedDateTime.now(zone);
        // Gets current time
        System.out.println(name + " Time: " + time);
    }
}

