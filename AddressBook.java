package Day24;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    static List<Contact> contactList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int i=0;
        AddressBook addressBook = new AddressBook();
        while (i == 0)
        {
            System.out.println("Would you like to continue?: ");
            System.out.println("1.Add details.\n2.Edit details.\n3.Delete the details");
            int choose = sc.nextInt();
            switch (choose)
            {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                default:
                    i = 1;
                    System.out.println("Wrong option");
                    addressBook.addContact();
                    break;
            }
        }
    }

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

   public void editContact(){
       Scanner nameInput = new Scanner(System.in);

       System.out.println(" Enter the first name ");

       String fName = nameInput.nextLine();
       for (int index = 0; index < contactList.size(); index++)
       {
           if (contactList.get(index).getFirstName().equals(fName))
           {
               contactList.remove(index);
               AddressBook addressBook = new AddressBook();
               addressBook.addContact();
           } else
           {
               System.out.println(" There is no contact ");
           }
       }
       }
    public void deleteContact()
    {
        Scanner deleteNameInput = new Scanner(System.in);

        String deleteFirstName = deleteNameInput.nextLine();

        for (int increment = 0; increment < contactList.size(); increment++)
        {
            if (contactList.get(increment).getFirstName().equals(deleteFirstName))
            {
                contactList.remove(increment);
            } else {
                System.out.println(" Name does not exist");
            }
        }
    }
   }


