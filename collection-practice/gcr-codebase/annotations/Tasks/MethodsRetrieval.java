import java.lang.reflect.Method;
public class MethodsRetrieval {
    public static void main(String[] args) {
        TestMethods test = new TestMethods();
        Method[] m=test.getClass().getDeclaredMethods();
        for(Method method:m){
            ToDo im=method.getAnnotation(ToDo.class);
            if(im.priority().equals("HIGH")){
                System.out.println("Method Name: "+method.getName()+" , Level: "+im.level());
            }   
        }
    }
}
