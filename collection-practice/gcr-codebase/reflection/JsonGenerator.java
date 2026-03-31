import java.lang.reflect.*;

class JsonGenerator {

    public static String toJson(Object obj) throws Exception {

        Class<?> c = obj.getClass();
        Field[] fields = c.getDeclaredFields();

        StringBuilder sb = new StringBuilder("{");

        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            f.setAccessible(true);

            sb.append("\"").append(f.getName()).append("\":");

            Object val = f.get(obj);
            if (val instanceof String) {
                sb.append("\"").append(val).append("\"");
            } else {
                sb.append(val);
            }

            if (i < fields.length - 1) sb.append(",");
        }
        sb.append("}");
        return sb.toString();
    }
}
