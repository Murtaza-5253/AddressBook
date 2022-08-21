package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
    ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    int choice, i = 0;

    public void inputContacts() {
        Contacts c = new Contacts();
        System.out.println("Enter the Mobile Number:- ");
        c.setMobNum(sc.next());
        if (!isAvailable(c.getMobNum())) {
            System.out.println("Enter the First Name:- ");
            c.setFirstName(sc.next());
            System.out.println("Enter the Last Name:- ");
            c.setLastName(sc.next());
            System.out.println("Enter the Email Id:- ");
            c.setEmailID(sc.next());
            System.out.println("Enter the Address:- ");
            c.setAddress(sc.next());
            System.out.println("Enter the City:- ");
            c.setCity(sc.next());
            System.out.println("Enter the State:- ");
            c.setState(sc.next());
            System.out.println("Enter the Pincode:- ");
            c.setPinCode(sc.next());
            contactsArrayList.add(c);
        } else {
            System.out.println("Contact already exists!!");
        }

    }

    void contactMenu() {
        int choice;
        do {
            System.out.println("**************************Enter the Operation to perform***********************");
            System.out.println("1.Add Contact \n2.Delete Contact \n3.Display Contact \n4.Update Contacts \n5.Search City \n6.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputContacts();
                    break;
                case 2:
                    deleteContacts();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    updateContacts();
                    break;
                case 5:
                    searchCity();
                    break;
                case 6:
                    System.out.println("Bye!!");
                    break;
                default:
                    System.out.println("Bye");
                    break;
            }
        } while (choice < 6);
    }

    public void searchCity() {
        System.out.println("Enter city to search:- ");
        String city = sc.next();
        List<Contacts> ct = contactsArrayList.stream()
                .filter(x -> x.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
        System.out.println(ct);
    }

    public void displayContacts() {
        System.out.println(contactsArrayList);
    }

    public void deleteContacts() {
        Contacts c;
        System.out.println("Enter name to delete contact:- ");
        String name = sc.next();
        for (int i = 0; i < contactsArrayList.size(); i++) {
            c = contactsArrayList.get(i);
            if (c.getFirstName().equals(name)) {
                contactsArrayList.remove(c);
                break;
            }
            System.out.println("No Contact of Name " + name + " found!!");
        }
    }

    public void updateContacts() {
        System.out.println("Enter name to update contact:- ");
        String name = sc.next();
        if (checkContact(name) != -1) {
            int num = checkContact(name);
            Contacts c = contactsArrayList.get(num);
            System.out.println("Enter the First Name:- ");
            c.setFirstName(sc.next());
            System.out.println("Enter the Last Name:- ");
            c.setLastName(sc.next());
            System.out.println("Enter the Mobile Number:- ");
            c.setMobNum(sc.next());
            System.out.println("Enter the Email Id:- ");
            c.setEmailID(sc.next());
            System.out.println("Enter the Address:- ");
            c.setAddress(sc.next());
            System.out.println("Enter the City:- ");
            c.setCity(sc.next());
            System.out.println("Enter the State: ");
            c.setState(sc.next());
            System.out.println("Enter the Pincode:- ");
            c.setPinCode(sc.next());
            contactsArrayList.add(c);
        } else {
            System.out.println("No Contact of Name found!!");
        }
    }

    public boolean isAvailable(String mobNo) {
        for (Contacts c : contactsArrayList) {
            if (c.getMobNum().equalsIgnoreCase(mobNo)) {
                return true;
            }
        }
        return false;
    }

    public int checkContact(String name) {
        int isPresent = -1;
        for (int i = 0; i < contactsArrayList.size(); i++) {
            Contacts c = contactsArrayList.get(i);
            if (c.getFirstName().equalsIgnoreCase(name)) {
                isPresent = i;
            }
        }
        return isPresent;
    }
}
