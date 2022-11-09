package Day24;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
public class AddressBook {
    static ArrayList<Contact> contactList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public String bookName;

//    public static void main(String[] args)
//    {
//        int i=0;
//        AddressBook addressBook = new AddressBook();
//        while (i == 0)
//        {
//            System.out.println("Would you like to continue?: ");
//            System.out.println("1.Add details.\n2.Edit details.\n3.Delete the details");
//            int choose = sc.nextInt();
//            switch (choose)
//            {
//                case 1:
//                    addressBook.addContact();
//                    break;
//                case 2:
//                    addressBook.editContact();
//                    break;
//                case 3:
//                    addressBook.deleteContact();
//                    break;
//                default:
//                    i = 1;
//                    System.out.println("Wrong option");
//                    addressBook.addContact();
//                    break;
//            }
//        }
//    }
public static void main(String[] args) {
    addressBook.createAddressBook();
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
//        contactList.add(addressBook);
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
//    Method to Create Multiple Contacts

    static HashMap<String, ArrayList<Contact>>hashmap = new HashMap<>();
    static AddressBook addressBook = new AddressBook();

   public void createAddressBook() {
    while (true) {
        System.out.println("Choose what you want to do: ");
        System.out.println(
                "1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
        int choose = sc.nextInt();
        if (choose == 4) {
            System.out.println("Exited");
            break;
        }
        switch (choose) {
            case 1:
                System.out.println("Enter the name of address book: ");
                String address_name = sc.next();
                // condition to check for uniqueness of address book.
                if (hashmap.containsKey(address_name)) {
                    System.out.println("Address book name exits, enter different name");
                    break;
                }
                ArrayList<Contact> new_address_book = new ArrayList<Contact>();
                contactList = new_address_book;
                while (true) {
                    int choose1;
                    System.out.println("Choose what you want to do: ");
                    System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
                    choose1 = sc.nextInt();
                    if (choose1 == 4) {
                        System.out.println("Exited");
                        break;
                    }
                    switch (choose1) {
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
                            System.out.println("Choose valid option");
                            break;
                    }
                    hashmap.put(address_name, (ArrayList<Contact>) contactList);
                    System.out.println(hashmap);
                }
                break;

            case 2:
                System.out.println("Enter the name of address book: ");
                String address_name_old = sc.next();
                // condition to check whether address book exists or not.
                if (hashmap.containsKey(address_name_old)) {
                    ArrayList<Contact> old_address_book = new ArrayList<>();
                    contactList = old_address_book;
                    contactList = hashmap.get(address_name_old);
                    while (true) {
                        System.out.println("Choose what you want to do: ");
                        System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
                        int choose2 = sc.nextInt();
                        if (choose2 == 4) {
                            System.out.println("Exited");
                            break;
                        }
                        switch (choose2) {
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
                                System.out.println("Choose valid option");
                                break;
                        }
                        hashmap.put(address_name_old, (ArrayList<Contact>) contactList);
                        System.out.println(hashmap);
                    }
                } else {
                    System.out.println("Enter valid address book name");
                }
                break;

            case 3:
                System.out.println(hashmap);
                break;
            default:
                System.out.println("Enter valid option");

        }
    }
}
   }


