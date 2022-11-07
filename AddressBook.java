package Day24;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    static List<Contact> contactList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    //method for adding contacts
    public static void addContact() {

        System.out.println(" Enter your first name : ");
        String firstName = sc.nextLine();

        System.out.println(" Enter your last name : ");
        String lastName = sc.nextLine();

        System.out.println(" Enter your city name : ");
        String cityName = sc.nextLine();

        System.out.println(" Enter your state name : ");
        String stateName = sc.nextLine();

        System.out.println(" Enter your zip code  : ");
        long zip = sc.nextLong();

        System.out.println(" Enter your phone number : ");
        Long phoneNumber = sc.nextLong();

        System.out.println(" Enter your email : ");
        String email = sc.next();

        Contact addressBook = new Contact(firstName, lastName, cityName, stateName, email, phoneNumber, zip);
        contactList.add(addressBook);
    }
    public static void main(String[] args)
    {
        addContact();
        System.out.println(contactList);
    }
}

