package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook
{
    public ArrayList<Contact> contactlist = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void createContact()
    {

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
        System.out.println("Enter Mobile Number");
        int mobile_No = scanner.nextInt();
        Contact contact = new Contact(firstname, lastName, address, city, state, email, zip, mobile_No);
        contactlist.add(contact);
        System.out.println(contactlist.add(contact));
        System.out.println("Person Details added Successfully");
        /*System.out.println(contact.toString());*/
    }
    public void displayContact()
    {
        System.out.println("Entered Person Details:");
        for (Contact contactperson : contactlist)
        {
            System.out.println(contactperson.toString());
        }
    }
    private void updateContact()
    {
        System.out.println("Enter First Name for update contact");
        String name = scanner.next();
        for(Contact contactPerson : contactlist)
        {
            System.out.println(contactPerson.toString());
            if (name.equals(contactPerson.firstName))
            {
                System.out.println("Enter Choice to update:\n1.Firstname.\n2. Mobile NO.\n3. Email-id\n4. Address\n5. Exit");
                int choice = scanner.nextInt();
                switch (choice)
                {
                    case 1 :
                    {
                        System.out.println("Enter new Firstname");
                        String firstname = scanner.next();
                        contactPerson.setFirstName(firstname);
                        System.out.println("Firstname updated successfully");
                        break;
                    }
                    case 2 :
                    {
                        System.out.println("Enter new mobile number");
                        int mobile_No = scanner.nextInt();
                        contactPerson.setMobile_No(mobile_No);
                        System.out.println("Mobile No updated successfully");
                        break;
                    }
                    case 3 :
                    {
                        System.out.println("Enter new E-mail");
                        String email = scanner.nextLine();
                        contactPerson.setEmail(email);
                        System.out.println("E-mail  updated successfully");
                        break;
                    }
                    case 4 : {
                        System.out.println("enter your city");
                        String city = scanner.next();

                        System.out.println("enter your state");
                        String state = scanner.next();

                        System.out.println("enter your zip code");
                        int zip = scanner.nextInt();

                        contactPerson.setCity(city);
                        contactPerson.setState(state);
                        contactPerson.setZip(zip);
                        System.out.println("Address updated successfully");
                        break;
                    }
                    default : System.out.println("please enter correct choice");
                }
            }
            else
            {
                System.out.println("Person not available");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        addressBook.createContact();
        addressBook.displayContact();
        int choice = 1;
        do
        {
            System.out.println("Enter Choice:\n1. Add Contact\n2. Edit Contact\n3. EXIT");
            int userchoice = scanner.nextInt();
            switch (userchoice)
            {
                case 1:
                    addressBook.createContact();
                    break;
                case 2:
                    addressBook.updateContact();
                    break;
                default:
                    break;
            }
        }while (choice == 0);
    }


}