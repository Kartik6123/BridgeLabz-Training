import java.util.*;

class CharacterFrequencyNested {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        String[] result = charFreq(string);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static String[] charFreq(String string) {
            // Method to find frequency using nested loops
        char[] arr = string.toCharArray();
        int len = arr.length;
        int[] freq = new int[len];

        //   Find frequency using nested loops
        for (int i = 0; i < len; i++) {
            if (arr[i] == '0') {
                continue;
            }
            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                     // mark duplicate
                }
            }
        }
        //  Count unique characters
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != '0') {
                count++;
            }
        }
        //  Store result in 1D String array
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != '0') {
                result[index++] = arr[i] + "\t" + freq[i];
            }
        }
        return result;
    }
}

