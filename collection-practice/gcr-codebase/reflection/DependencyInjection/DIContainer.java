package DependencyInjection;

import java.lang.reflect.*;

class DIContainer {

    public static <T> T create(Class<T> clazz) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Field f : clazz.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                Object dep = f.getType().getDeclaredConstructor().newInstance();
                f.set(obj, dep);
            }
        }
        return obj;
    }
}

