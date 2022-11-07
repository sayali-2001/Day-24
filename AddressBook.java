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

    public static void main(String[] args) {
        addContact();
        System.out.println(contactList);
        Scanner obj = new Scanner(System.in);
        int flag = 1;
        while(flag ==1)

        {
            
            System.out.println(" Choose your choice : 1.Add 2.Exit ");
            int choice = obj.nextInt();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    flag = 0;
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}


