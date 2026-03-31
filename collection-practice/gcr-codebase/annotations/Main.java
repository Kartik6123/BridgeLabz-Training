import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Main {

    // 1️ Annotation
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface JsonField {
        String name();
    }

    // 2️ User class
    static class User {

        @JsonField(name = "user_name")
        private String username;

        @JsonField(name = "user_age")
        private int age;

        private String password;

        User(String username, int age, String password) {
            this.username = username;
            this.age = age;
            this.password = password;
        }
    }

    // 3️ JSON Serializer
    static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {

                JsonField ann = field.getAnnotation(JsonField.class);
                field.setAccessible(true);

                try {
                    Object value = field.get(obj);

                    if (!first) json.append(",");
                    json.append("\"")
                        .append(ann.name())
                        .append("\":\"")
                        .append(value)
                        .append("\"");

                    first = false;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        json.append("}");
        return json.toString();
    }

    // 4️ Test
    public static void main(String[] args) {
        User u = new User("kartik", 22, "secret");
        System.out.println(toJson(u));
    }
}
