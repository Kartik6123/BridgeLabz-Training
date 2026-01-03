package inheritance;

// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface defining work behavior
interface Worker {
    void performDuties();
}

// Subclass 1
public class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef prepares and cooks food.");
    }
}

// Subclass 2
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter serves food to customers.");
    }
}

 class Main {
    public static void main(String[] args) {

        // Hybrid inheritance: inheritance + interface
        Worker w1 = new Chef("Rahul", 101);
        Worker w2 = new Waiter("Amit", 102);

        w1.performDuties();
        w2.performDuties();
    }
}

