package ConfigrationClass;

import java.lang.reflect.*;

public class ConfigrationDemo {
    public static void main(String[] args) throws Exception {

        Class<?> c = Configuration.class;

        Field f = c.getDeclaredField("API_KEY");
        f.setAccessible(true);

        f.set(null, "NEW_SECRET_KEY");  

        System.out.println(f.get(null));
    }
}
