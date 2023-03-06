import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList<Contact> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Contact[] contactsArray = new Contact[1];

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContact();
    }

    public void addContact() {
        for (int i = 0; i < contactsArray.length; i++) {
            Contact contact = new Contact();
            System.out.println("Enter First Name :");
            contact.firstname = scanner.next();
            System.out.println("Enter Last Name :");
            contact.lastname = scanner.next();
            System.out.println("Enter Address :");
            contact.address = scanner.next();
            System.out.println("Enter State :");
            contact.state = scanner.next();
            System.out.println("Enter City :");
            contact.city = scanner.next();
            System.out.println("Enter Zip :");
            contact.zip = scanner.nextInt();
            System.out.println("Enter Phone_number :");
            contact.phone_number = scanner.nextInt();
            System.out.println("Enter Email :");
            contact.email = scanner.next();
            contactsArray[i] = contact;

        }
    }
}



