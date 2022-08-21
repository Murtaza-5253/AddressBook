package AddressBook;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookMain {

    Map<String,AddressBook> m=new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AddressBookMain ad = new AddressBookMain();
        System.out.println("Welcome to Address Book");
        int choice;
        do {
            System.out.println("**************************Enter the Operation to perform***********************");
            System.out.println("1.Create Addressbook \n2.Display Addressbook \n3.Select Addressbook \n4.Update \n5.Delete \n6.Search City \n7.Exit");
            choice = ad.sc.nextInt();
            switch (choice) {
                case 1:
                    ad.createAddressbook();
                    break;
                case 2:
                    ad.displayAddressbook();
                    break;
                case 3:
                    ad.selectAddressbook();
                    break;
                case 4:
                    ad.updateAddressbook();
                    break;
                case 5:
                    ad.deleteAddressbook();
                    break;
                case 6:
                    ad.searchCity();
                    break;
                case 7:
                    System.out.println("Bye!!");
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        } while (choice < 7);
    }

    public void updateAddressbook()
    {
        System.out.println("Enter Addressbook name to update:- ");
        String name = sc.next();
        if(!checkAddress(name)){

        }

    }

    public void deleteAddressbook(){
        System.out.println("Enter Addressbook name to update:- ");
        String name = sc.next();
        if(!checkAddress(name)){
            m.
        }
    }

    public void searchCity()
    {
        System.out.println("Enter City to Search:- ");
        final String city = sc.next();
        for(AddressBook book : m.values()){
            List<Contacts> c = book.contactsArrayList.stream()
                    .filter(x->x.getCity().equalsIgnoreCase(city))
                    .collect(Collectors.toList());
            System.out.println(c);
        }
    }

    public void createAddressbook()
    {
        System.out.println("Enter Addressbook Name:- ");
        String adName = sc.next();
        if(!checkAddress(adName)){
            m.put(adName,new AddressBook());
        }
    }

    public void displayAddressbook()
    {
        for(String key:m.keySet()){
            System.out.println(key);
        }

    }

    public void selectAddressbook()
    {
        displayAddressbook();
        System.out.println("Enter Addressbook Name to select:- ");
        String adName = sc.next();
        if(checkAddress(adName)){
            AddressBook ad = m.get(adName);
            ad.contactMenu();
        }
        else {
            System.out.println("Please enter correct name");
        }
    }

    public boolean checkAddress(String adName){
        for(String key:m.keySet()){
            if(key.contains(adName)){
                System.out.println("Address book already exists");
                return true;
            }
        }
        return false;
    }
}

