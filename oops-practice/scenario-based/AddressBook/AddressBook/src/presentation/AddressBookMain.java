package presentation;

import dao.AddressBookDirectoryDAO;
import model.Contact;
import service.AddressBookDirectoryService;
import service.AddressBookService;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookDirectoryDAO dao = new AddressBookDirectoryDAO();
        AddressBookDirectoryService directoryService = new AddressBookDirectoryService(dao);


        // Create Address Books
        directoryService.createAddressBook("Personal");
        directoryService.createAddressBook("Office");

        // Add Contacts
        directoryService.getAddressBook("Personal").getContacts().add(new Contact("Rahul", "Sharma", "Delhi", "Delhi","Delhi", "110001", "9999999999", "rahul@gmail.com")
        );

        directoryService.getAddressBook("Office").getContacts().add(new Contact("Amit", "Verma", "Delhi", "Delhi","Delhi", "201301", "8888888888", "amit@gmail.com")
        );

        // Search
        directoryService.searchPersonByCity("Delhi");
        directoryService.searchPersonByCity("UP");
        directoryService.searchPersonByState("Delhi");
    }
}
