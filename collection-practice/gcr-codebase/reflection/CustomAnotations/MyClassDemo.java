package CustomAnotations;
public class MyClassDemo {
    public static void main(String[] args) {

        Class<MyClass> c = MyClass.class;

        Author a = c.getAnnotation(Author.class);

        if (a != null) {
            System.out.println("Author Name: " + a.name());
        }
    }
}

