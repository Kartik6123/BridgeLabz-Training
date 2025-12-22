import java.util.*;

class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        String[][] output = new String[games][3];
        int userWins = 0;
        int compWins = 0;
            for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock,paper,scissors):");
            String userInput = sc.nextLine().toLowerCase();
            String compInput = Compchoice();
            String winner = findWinner(userInput, compInput);
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                compWins++;
            }
            output[i][0] = userInput;
            output[i][1] = compInput;
            output[i][2] = winner;
        }
        String[][] stats = stats(userWins, compWins, games);
        // Display game results and statistics
        displayResults(output, stats);
    }

    // Method to generate computer choice
    static String Compchoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0)
            return "rock";
        else if (choice == 1)
            return "paper";
        else
            return "scissors";
    }

    // Method to find winner
    static String findWinner(String str, String computer) {

        if (str.equals(computer))
            return "Draw";

        if (str.equals("rock") && computer.equals("scissors"))
            return "User";
        if (str.equals("rock") && computer.equals("paper"))
            return "Computer";

        if (str.equals("paper") && computer.equals("rock"))
            return "User";
        if (str.equals("paper") && computer.equals("scissors"))
            return "Computer";

        if (str.equals("scissors") && computer.equals("paper"))
            return "User";
        if (str.equals("scissors") && computer.equals("rock"))
            return "Computer";

        return "Invalid";
    }

    // Method to calculate average and percentage
    static String[][] stats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;
        //Format to 2 decimal places
        userPercent = Math.round(userPercent * 100.0) / 100.0;
        compPercent = Math.round(compPercent * 100.0) / 100.0;
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] =  String.valueOf(userPercent);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] =  String.valueOf(compPercent);
        //Percentage with 2 decimal places
        return stats;
    }
    // Method to display game output and statistics
    static void displayResults(String[][] output, String[][] stats) {
        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%"
            );
        }
    }
}
