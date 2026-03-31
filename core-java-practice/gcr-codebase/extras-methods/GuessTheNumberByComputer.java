import java.util.Scanner;

public class GuessTheNumberByComputer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int end = 100;
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Reply with: higher, lower, or yes");
        boolean found = false;
        while (!found && start <= end) {
            int computerGuess = createGuess(start, end);
            System.out.println("Guess is: " + computerGuess);
            System.out.print("Your response: ");
            String response = sc.next().toLowerCase();
            found = processResponse(response, computerGuess);
            if (!found) {
                int[] limits = adjustLimits(start, end, computerGuess, response);
                start = limits[0];
                end = limits[1];
            }
        }

        if (!found) {
            System.out.println("The responses were inconsistent!");
        }
    }

    // Generates a guess using the current range
    static int createGuess(int min, int max) {
        return min + (max - min) / 2;
    }

    // Checks if the guess is correct
    static boolean processResponse(String reply, int guess) {
        if (reply.equals("yes")) {
            System.out.println("Great! I found your number: " + guess);
            return true;
        }
        return false;
    }

    // Updates the guessing range based on feedback
    static int[] adjustLimits(int min, int max, int guess, String reply) {
        if (reply.equals("higher")) {
            min = guess + 1;
        } else if (reply.equals("lower")) {
            max = guess - 1;
        }
        return new int[]{min, max};
    }
}

