
public class TestMethods {
    @ImportantMethod(level = "CRITICAL")
    public void performCriticalOperation() {
        System.out.println("Performing critical operation");
    }
    @ImportantMethod(level="NORMAL")
    public void performNormalOperation() {
        System.out.println("Performing normal operation");
    }
}
