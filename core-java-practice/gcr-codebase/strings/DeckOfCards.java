import java.util.*;

class DeckOfCards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suitSet = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] rankSet = {"2", "3", "4", "5", "6", "7", "8", "9",
                            "10", "Jack", "Queen", "King", "Ace"};

        String[] cards = DeckBuild(suitSet, rankSet);
        DeckMix(cards);

        System.out.print("Enter number of players: ");
        int playerCount = sc.nextInt();

        System.out.print("Enter cards per player: ");
        int cardsEach = sc.nextInt();

        String[][] players = CardDeal(cards, playerCount, cardsEach);

        if (players != null) {
            showPlayers(players);
        }
    }

    // Creates the deck of cards
    static String[] DeckBuild(String[] suits, String[] ranks) {
        int total = suits.length * ranks.length;
        String[] deck = new String[total];

        int pos = 0;
        for (int s = 0; s < suits.length; s++) {
            for (int r = 0; r < ranks.length; r++) {
                deck[pos++] = ranks[r] + " of " + suits[s];
            }
        }
        return deck;
    }

    // Shuffles the deck using Math.random()
    static void DeckMix(String[] deck) {
        int size = deck.length;

        for (int i = 0; i < size; i++) {
            int rand = i + (int)(Math.random() * (size - i));

            String swap = deck[i];
            deck[i] = deck[rand];
            deck[rand] = swap;
        }
    }

    // Distributes cards to players
    static String[][] CardDeal(String[] deck, int players, int perPlayer) {

        if (players * perPlayer > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] table = new String[players][perPlayer];
        int index = 0;

        for (int p = 0; p < players; p++) {
            for (int c = 0; c < perPlayer; c++) {
                table[p][c] = deck[index++];
            }
        }
        return table;
    }

    // Prints players and their cards
    static void showPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player "+ ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }
}

