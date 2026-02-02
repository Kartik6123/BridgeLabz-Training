import java.lang.reflect.*;
import java.util.*;

class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> props) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> e : props.entrySet()) {
            Field f = clazz.getDeclaredField(e.getKey());
            f.setAccessible(true);
            f.set(obj, e.getValue());
        }
        return obj;
    }
}
