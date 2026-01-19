import java.util.*;
public class AddressBookService {
	
	// Use Case 1
	// Use Case 2
	public static void addContact(Contact c) {
		if(!AddressBookData.contactMap.containsKey(c.firstName.toLowerCase())) {
			AddressBookData.contactList.add(c);
			AddressBookData.contactMap.put(c.firstName.toLowerCase(), c);
			System.out.println("Contact added successfully");
		}
		
		else {
			System.out.println("Contact with same Number already exists");
		}
	}
	
	// Use Case 3
	public static void editContactByName(String name, Contact c) {
		if(!AddressBookData.contactMap.containsKey(name.toLowerCase())) {
			System.out.println("Contact does not exist");
		}
		
		else {
			Contact newContact = c;
			AddressBookData.contactMap.remove(name.toLowerCase());
			for(int i = 0; i < AddressBookData.contactList.size(); i++) {
				Contact contact = AddressBookData.contactList.get(i);
				if(contact.firstName.toLowerCase().equals(name)) {
					AddressBookData.contactList.remove(i);
				}
			}
			
			addContact(newContact);
			
			System.out.println("Contact edited successfuly");
		}
	}
	
	//Use Case 4
	public static void deleteContactByName(String name) {
		if(!AddressBookData.contactMap.containsKey(name.toLowerCase())) {
			System.out.println("Contact does not exist");
		}
		
		else {
			AddressBookData.contactMap.remove(name.toLowerCase());
			for(int i = 0; i < AddressBookData.contactList.size(); i++) {
				Contact contact = AddressBookData.contactList.get(i);
				if(contact.firstName.toLowerCase().equals(name)) {
					AddressBookData.contactList.remove(i);
				}
			}
			
			System.out.println("Contact Deleted Successfully");
		}
	}
}