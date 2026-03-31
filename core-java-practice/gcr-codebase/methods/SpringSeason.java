 import java.util.Scanner;
 class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int month =sc.nextInt();
        int day = sc.nextInt();
        boolean isSpring = checkSpringSeason(month, day);
        //method call
        if (isSpring)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }

    static boolean checkSpringSeason(int month, int day) {
        //method to check spring season
        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20))
            return true;
        else
            return false;
    }
}

