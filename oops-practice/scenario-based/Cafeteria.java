import java.util.*;

class Cafeteria{

    static void DisplayMenu(String[] menu) {
        // displays menu with index numbers
        System.out.println("Cafeteria Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " : " + menu[i]);
        }
    }

    static String GetItemByIndex(String[] menu, int index) {
        // returns item based on index
        if (index >= 0 && index < menu.length) {
            return menu[index];
        }
        return "Invalid selection";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Idli", "Dosa", "Vada", "Pongal", "Upma",
            "Sandwich", "Burger", "Pizza", "Pasta", "Juice"
        };

        DisplayMenu(menu);

        System.out.print("Enter item index: ");
        int choice = sc.nextInt();

        System.out.println("Selected Item: " + GetItemByIndex(menu, choice));
    }
}
