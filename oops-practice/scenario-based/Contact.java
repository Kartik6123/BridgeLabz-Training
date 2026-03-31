import java.util.*;
                       
class InvalidPhoneNumberException extends Exception {
    InvalidPhoneNumberException(String msg) {
        super(msg);
    }
}

public class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class ContactOrganizer {

    static void addContact(List<Contact> list, String name, String phone)
            throws InvalidPhoneNumberException {

        // validate phone number length and digits
        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Invalid phone number");
        }

        // prevent duplicate contacts using phone number
        for (Contact c : list) {
            if (c.phone.equals(phone)) {
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }

        list.add(new Contact(name, phone));
        System.out.println("Contact added");
    }

    static void deleteContact(List<Contact> list, String phone) {
        // iterator used to safely remove element while looping
        Iterator<Contact> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().phone.equals(phone)) {
                it.remove();
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    static void searchContact(List<Contact> list, String phone) {
        for (Contact c : list) {
            if (c.phone.equals(phone)) {
                System.out.println("Name: " + c.name + ", Phone: " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("1.Add  2.Delete  3.Search  4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                if (choice == 1) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();
                    addContact(contacts, name, phone);
                } else if (choice == 2) {
                    System.out.print("Enter phone to delete: ");
                    deleteContact(contacts, sc.nextLine());
                } else if (choice == 3) {
                    System.out.print("Enter phone to search: ");
                    searchContact(contacts, sc.nextLine());
                } else {
                    break;
                }
            } catch (InvalidPhoneNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

