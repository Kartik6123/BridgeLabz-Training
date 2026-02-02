package DependencyInjection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}


class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    @Inject
    private Engine engine;

    void drive() {
        engine.start();
    }
}

