public class SensitiveDataTagging {
    // Custom marker interface
    interface SensitiveData {
    }
    static class BankAccount implements SensitiveData {
        String accountNumber;

        BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234-5678");
        if (acc instanceof SensitiveData) {
            System.out.println("Encrypt this data before storage");
        }
    }
}
