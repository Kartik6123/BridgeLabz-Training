class RandomNumberAnalysis {

    public static void main(String[] args) {
        int size = 5;
        int[] numbers = generateNumbers(size);
        System.out.print("Generated numbers: ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
        double[] result = findAverage(numbers);
        System.out.println("Average value = " + result[0]);
        System.out.println("Minimum value = " + result[1]);
        System.out.println("Maximum value = " + result[2]);
    }
    public static int[] generateNumbers(int size) {
        // Generates an array of 4-digit random numbers
        int[] numbers = new int[size];
        for (int idx = 0; idx < size; idx++) {
            numbers[idx] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    public static double[] findAverage(int[] numbers) {
        // Finds average, minimum, and maximum of the array
        int minValue = numbers[0];
        int maxValue = numbers[0];
        int sum = 0;

        for (int value : numbers) {
            sum += value;
            minValue = Math.min(minValue, value);
            maxValue = Math.max(maxValue, value);
        }

        double average = (double) sum / numbers.length;

        double[] result = new double[3];
        result[0] = average;
        result[1] = minValue;
        result[2] = maxValue;

        return result;
    }
}

