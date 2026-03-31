
import java.lang.reflect.Method;
public class MethodsRetrival {
    public static void main(String[] args) {
        TestMethods test = new TestMethods();
        Method[] m=test.getClass().getDeclaredMethods();
        for(Method method:m){
            ImportantMethod im=method.getAnnotation(ImportantMethod.class);
            if(im!=null){
                System.out.println("Method Name: "+method.getName()+" , Level: "+im.level());
            }
        }
    }
}
