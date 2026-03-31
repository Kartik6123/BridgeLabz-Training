public class Test {
    public static void main(String[] args) {
        new User("John");        // OK
        new User("JohnDoe12345"); // Exception
    }
}
