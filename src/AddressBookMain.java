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
        addressBookMain.editContact();
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

    public void editContact() {
        for (Contact contact : contactsArray) {
            System.out.println("Enter how you want to edit detail:" +
                    "\n edit firstname" +
                    "\n edit lastname" +
                    "\n edit address" +
                    "\n edit stats" +
                    "\n edit city" +
                    "\n edit zip" +
                    "\n edit phone_number" +
                    "\n edit email");
           String Edit = scanner.next();
            switch (Edit){
                case "firstname":
                    System.out.println("Enter the First Name to edit :");
                    String firstName = scanner.next();
                    if (firstName.equals(contact.getFirstname()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter First Name");
                    contact.setFirstname(scanner.next());
                    break;
                case "lastname":
                    System.out.println("Enter the Last name to edit :");
                    String lastName = scanner.next();
                    if (lastName.equals(contact.getLastname()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter the Last Name :");
                    contact.setLastname(scanner.next());
                    break;
                case "address":
                    System.out.println("Enter the Address to edit :");
                    String address = scanner.next();
                    if (address.equals(contact.getAddress()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter Address :");
                    contact.setAddress(scanner.next());
                    break;
                case "state":
                    System.out.println("Enter the state to edit :");
                    String state = scanner.next();
                    if (state.equals(contact.getState()))
                        System.out.println("Edit the details of person :");
                    System.out.println("enter state");
                    contact.setState(scanner.next());
                    break;
                case "city":
                    System.out.println("Enter the City to edit :");
                    String city = scanner.next();
                    if (city.equals(contact.getCity()))
                        System.out.println("Edit the details of person:");
                    System.out.println("enter city");
                    contact.setCity(scanner.next());
                    break;
                case "zip":
                    System.out.println("Enter the zip to edit :");
                    String zip = scanner.next();
                    if (zip.equals(contact.getZip()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter zip :");
                    contact.setZip(scanner.nextInt());
                    break;
                case "phonenumber":
                    System.out.println("Enter the phone_number to edit :");
                    String phone_number = scanner.next();
                    if (phone_number.equals(contact.getPhone_number()))
                        System.out.println("Edit the details of person : ");
                    System.out.println("Enter phone_number :");
                    contact.setPhone_number(scanner.nextInt());
                    break;
                case "email":
                    System.out.println("Enter the email to edit :");
                    String email = scanner.next();
                    if (email.equals(contact.getEmail()))
                        System.out.println("Edit the details of person :");
                    System.out.println("Enter email :");
                    contact.setEmail(scanner.next());
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }
}
