package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook
{
    public ArrayList<Contact> contactlist = new ArrayList<>();
    public void createContact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Firstname");
        String firstname = scanner.nextLine();
        System.out.println("Enter Last Name");
        String lastName = scanner.nextLine();
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        System.out.println("Enter City");
        String city = scanner.nextLine();
        System.out.println("Enter State");
        String state = scanner.nextLine();
        System.out.println("Enter E mail");
        String email = scanner.next();
        System.out.println("Enter Zip Code");
        int zip = scanner.nextInt();
        System.out.println("Enter Phone Number");
        long mobileNo = scanner.nextLong();
        Contact contact = new Contact(firstname,lastName,address,city,state,email,zip,mobileNo);
        contactlist.add(contact);
        System.out.println(contactlist.add(contact));
        System.out.println("Person Details added Successfully");
    }
    public void displayContact()
    {
        System.out.println("Entered Person Details:");
        for (Contact contactperson : contactlist)
        {
            System.out.println(contactperson.toString());
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        addressBook.createContact();
        addressBook.displayContact();
    }
}