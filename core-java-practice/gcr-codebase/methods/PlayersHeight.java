public class PlayersHeight {
    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }

    static int[] generateHeights(int size) {
        // generate random heights
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); 
            // 150 to 250
        }
        return heights;
    }
    static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
        //mean height
    }

    static int findShortest(int[] heights) {
        // find min height
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    static int findTallest(int[] heights) {
        //find max height
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
}