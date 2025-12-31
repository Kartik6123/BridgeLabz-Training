package contructors;
public class Person {
    String name;
    int age;

    Person(){
        // default constructor
        name="";
        age=0;
    }
    Person(String name, int age){
        // parameterized constructor
        this.name=name;
        this.age=age;
    }
    Person(Person p){
        // copy constructor
        this.name=p.name;
        this.age=p.age;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person(person2);

        person1.display();
        person2.display();
        person3.display();
    }
}
