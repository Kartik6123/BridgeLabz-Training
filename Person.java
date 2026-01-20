class NotaPerson extends Exception {
    public NotaPerson(String message) {
        super(message);
    }
}
public class Person{
    private String name;
    private int age;
    public Person(String name, int age) throws NotaPerson {
        if (age < 0) {
            throw new NotaPerson("Age cannot be negative");
        }
          if(name.equals("")){
            throw new NotaPerson("Name cannot be empty");
}
        this.name = name;
        this.age = age;
    }
}
class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Alice", -5);
        } catch (NotaPerson e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}