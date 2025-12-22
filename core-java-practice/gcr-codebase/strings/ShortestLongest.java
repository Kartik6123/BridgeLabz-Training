import java.util.*;
class ShortestLongest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String string = in.nextLine();
        String[] wordList = breakWords(string);
        String[][] word = mapLength(wordList);
        int[] range = search(word);
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i][0] + " : " + word[i][1]);
        }
        System.out.println("Shortest Word: " + word[range[0]][0]);
        System.out.println("Longest Word : " + word[range[1]][0]);
    }

    // Split text into words using charAt()
    static String[] breakWords(String text) {
        int parts = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') parts++;

        String[] words = new String[parts];
        int idx = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ')
                temp += c;
            else {
                words[idx++] = temp;
                temp = "";
            }
        }
        words[idx] = temp;
        return words;
    }

    // Find length without using length()
    static int count(String s) {
        int n = 0;
        try {
            while (true) s.charAt(n++);
        } catch (Exception e) {
            return n;
        }
    }

    // Create word-length table
    static String[][] mapLength(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(count(words[i]));
        }
        return data;
    }

    // Find shortest & longest word indexes
    static int[] search(String[][] table) {
        int min = 0, max = 0;

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);

            if (len < Integer.parseInt(table[min][1])) min = i;
            if (len > Integer.parseInt(table[max][1])) max = i;
        }
         int a[]=new int[2];
            a[0]=min;
            a[1]=max;
            return a;
    }
}

