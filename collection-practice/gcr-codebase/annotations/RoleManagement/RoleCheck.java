import java.lang.reflect.Constructor;

public class RoleCheck {
    @RoleAllowed(role = "ADMIN")
    RoleCheck(String role) {
        this.role = role;
        validateRole();
    }
    void validateRole() {
         RoleCheck obj = new RoleCheck("ADMIN");
         Constructor[] constructors = obj.getClass().getConstructors();
            for (Constructor constructor : constructors) {
                if (constructor.isAnnotationPresent(RoleAllowed.class)) {
                    RoleAllowed roleAllowed = (RoleAllowed) constructor.getAnnotation(RoleAllowed.class);
                    if (this.role.equals(roleAllowed.role())) {
                        System.out.println("Access granted to role: " + this.role);
                    } else {
                        System.out.println("Access denied for role: " + this.role);
                    }
                }
    }
}
}
