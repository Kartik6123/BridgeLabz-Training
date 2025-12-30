public class SnakeLadderGame {

    static final int TARGET = 100;

    public static void main(String[] args) {
        //Use Case 1: Two players start at position 0
        int posA = 0;
        int posB = 0;
        int rollCount = 0;

        boolean isATurn = true;

        while (posA < TARGET && posB < TARGET) {
            //Use Case 4: Players take turns to roll the dice and move
            int diceValue = rollDice();     
            int choice = getOption();       
            rollCount++;
            if (isATurn) {
                posA = updatePosition(posA, diceValue, choice);
                System.out.println("Player A rolled " + diceValue + " Position: " + posA);

                if (choice != 1) {
                    isATurn = false;        
                    // Extra chance only for ladder
                }
            } else {
                posB = updatePosition(posB, diceValue, choice);
                System.out.println("Player B rolled " + diceValue + " Position: " + posB);

                if (choice != 1) {
                    isATurn = true;
                }
            }
        }
        // Use Case 6: Display total number of dice rolls
        System.out.println("Total Dice Rolls: " + rollCount);

        if (posA == TARGET) {
            // Use Case 5: First player to reach position 100 wins
            System.out.println("Player A wins the game!");
            //Use Case  7:Display which player won the game
        } else {
            System.out.println("Player B wins the game!");
        }
    }

    static int rollDice() {
         // Use Case 2: Player rolls the dice to get a number between 1 to 6
        return (int) (Math.random() * 6) + 1;
    }

    static int getOption() {
         // Use Case 3: Player gets an option - No Play, Ladder, or Snake
        return (int) (Math.random() * 3); 
        // 0-No Play, 1-Ladder, 2-Snake
    }

    static int updatePosition(int current, int dice, int option) {

        if (option == 1) {                  
            // Ladder
            if (current + dice <= TARGET)
                current += dice;
        } else if (option == 2) {           
            // Snake
            current -= dice;
            if (current < 0)
                current = 0;
        }
        // No Play → position unchanged

        return current;
    }
}
