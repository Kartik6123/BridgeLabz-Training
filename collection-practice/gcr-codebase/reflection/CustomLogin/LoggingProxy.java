package CustomLogin;

import java.lang.reflect.*;

class LoggingProxy {

    public static Object create(Object target) {

        return Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            (proxy, method, args) -> {
                System.out.println("Calling: " + method.getName());
                return method.invoke(target, args);
            }
        );
    }
}
