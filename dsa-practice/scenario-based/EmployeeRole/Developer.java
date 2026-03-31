public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary, salary > 50000 ? salary * 0.05 : 0.0);
    }
}
