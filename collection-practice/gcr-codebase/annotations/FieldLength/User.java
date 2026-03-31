import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        this.username = username;
        validate();
    }

    private void validate() {
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength max = field.getAnnotation(MaxLength.class);

            if (max != null && username.length() > max.value()) {
                throw new IllegalArgumentException(
                    "Username exceeds max length of " + max.value()
                );
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
