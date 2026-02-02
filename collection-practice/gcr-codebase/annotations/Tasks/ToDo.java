import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ToDo{
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
