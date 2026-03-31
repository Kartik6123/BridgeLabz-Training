public class TemperatureAnalyzer {

    static void analyzeTemperature(float[][] temp) {
        int hottestDay = 0, coldestDay = 0;
        float maxTemp = temp[0][0], minTemp = temp[0][0];

        // Loop through each day
        for (int day = 0; day < 7; day++) {
            float sum = 0;

            // Loop through 24 hours of a day
            for (int hour = 0; hour < 24; hour++) {
                float current = temp[day][hour];
                sum += current; // accumulate daily temperature

                // Check for hottest temperature
                if (current > maxTemp) {
                    maxTemp = current;
                    hottestDay = day;
                }

                // Check for coldest temperature
                if (current < minTemp) {
                    minTemp = current;
                    coldestDay = day;
                }
            }

            // Print average temperature of the day
            System.out.println("Average temperature of Day ");
        }

        // Print hottest and coldest day
        System.out.println("Hottest Day : Day " + (hottestDay + 1));
        System.out.println("Coldest Day : Day " + (coldestDay + 1));
    }

    public static void main(String[] args) {
        float[][] temperatures = new float[7][24];
        analyzeTemperature(temperatures);
    }
}
