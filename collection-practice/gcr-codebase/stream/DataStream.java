import java.io.*;

class DataStream {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        DataInputStream dis = null;

        try {
            // Writing data
            dos = new DataOutputStream(new FileOutputStream("student.dat"));
            dos.writeInt(101);
            dos.writeUTF("Kartik");
            dos.writeDouble(8.7);
            dos.close();

            // Reading data
            dis = new DataInputStream(new FileInputStream("student.dat"));
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Roll No: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("IOException occurred");
        } finally {
            try {
                if (dos != null) dos.close();
                if (dis != null) dis.close();
            } catch (IOException e) {
                System.out.println("Error closing streams");
            }
        }
    }
}
