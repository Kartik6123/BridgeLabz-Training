import java.util.*;
public class AddressBook {
	public static void main(String[] args) {
		Contact c1 = new Contact("Kartik", "Arora", "Firozabad", "Firozabad", "283203", "7505XXXXXX", "xyz@gmail.com");
		
		AddressBookService.addContact(c1);
		
		Contact c2 = new Contact("Aman", "Gupta", "Ghaziabad", "Firozabad", "281203", "7105XXXXXX", "xqz@gmail.com");

		
//		AddressBookService.addContact(c2);
		AddressBookService.editContactByName("Arpit", c2);
		AddressBookService.deleteContactByName("Aman");
	}
}