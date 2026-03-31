public class TestMethods {
    @ToDo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void login() {
        System.out.println("Login feature");
    }
    @ToDo(task = "Set up database", assignedTo = "Bob",priority = "LOW")
    public void setupDatabase() {
        System.out.println("Database setup");
    }
}
