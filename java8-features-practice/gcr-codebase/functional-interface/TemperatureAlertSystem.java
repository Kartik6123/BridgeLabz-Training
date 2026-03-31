import java.util.function.Predicate;
public class TemperatureAlertSystem {

    public static void main(String[] args) {
        double currentTemperature = 42.5;
        double threshold = 40.0;

        // Predicate functional interface
        Predicate<Double> isTemperatureHigh =
                temp -> temp > threshold;
        if (isTemperatureHigh.test(currentTemperature)) {
            System.out.println(" Alert! Temperature crossed threshold");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}
