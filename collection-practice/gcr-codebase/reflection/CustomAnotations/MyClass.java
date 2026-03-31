package CustomAnotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}
@Author(name = "Kartik Arora")
 class MyClass {
}
