import java.io.*;

class UserInputToFile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = null;

        try {
            System.out.print("Enter name: ");
            String name = br.readLine();

            System.out.print("Enter age: ");
            String age = br.readLine();

            System.out.print("Enter favorite programming language: ");
            String lang = br.readLine();

            fw = new FileWriter("user_data.txt");

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + lang + "\n");

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred");
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}

