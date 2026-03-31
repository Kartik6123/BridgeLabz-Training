package library_catalog;

public class UserFactory {

    public static LibraryUser createUser(String role, String name) {

        switch (role.toLowerCase()) {
            case "student": return new Student(name);
            case "faculty": return new Faculty(name);
            case "librarian": return new Librarian(name);
            default: throw new IllegalArgumentException("Invalid user role");
        }
    }
}