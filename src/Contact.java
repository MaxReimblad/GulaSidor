import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<ContactInfo> contacts = new ArrayList<>();

    public void printContacts(){
        int index = 1;
        for (ContactInfo contacts : contacts){
            System.out.println(index++ + ": " + contacts.getFirstName() + " " + contacts.getLastName());
        }
    }

    public void premadeContacts() {
        ContactInfo personOne = new ContactInfo("Max", "Reimblad", 25, "0707708928",
                "Landsvägen", 62, 75912, "Storvik");
        contacts.add(personOne);

        ContactInfo personTwo = new ContactInfo("Pelle", "Knutlös", 48, "123456789",
                "Kattgatan", 12, 12345, "Jönköping");
        contacts.add(personTwo);

        ContactInfo personThree = new ContactInfo("Jonna", "Andersson", 33,
                "0735692281", "Snickaregatan", 4, 53910, "Motala");
        contacts.add(personThree);

        ContactInfo personFour = new ContactInfo("Albin", "Karlsson", 26,
                "0709433551", "Svanåállen", 6, 70232, "Örebro");
        contacts.add(personFour);
    }

    public void addNewContact(){
        System.out.println("Please type in your name:");
        String name = scanner.next();
        System.out.println("Type in your last name:");
        String lastName = scanner.next();
        System.out.println("Type in your age:");
        int age = scanner.nextInt();
        System.out.println("Type in your phone-number:");
        String phoneNumber = scanner.next();
        System.out.println("Type in your street name:");
        String streetName = scanner.next();
        System.out.println("Type in your street number:");
        int streetNumber = scanner.nextInt();
        System.out.println("Type in your zipcode:");
        int zipCode = scanner.nextInt();
        System.out.println("Type in the name of your city:");
        String city = scanner.next();
        ContactInfo contact = new ContactInfo(name,lastName,age,phoneNumber,streetName,streetNumber,zipCode,city);

        contacts.add(contact);
    }

    public void removeContact(int index){
        contacts.remove(index-1);
    }

    public void updateContact(int index){
        System.out.println("Update Name on contact: " + index-- + " from "
                + contacts.get(index).getFirstName() + " to:");
        String name = scanner.next();
        System.out.println("Update Lastname from " + contacts.get(index).getLastName() + " to:");
        String lastName = scanner.next();
        System.out.println("Update Age from " + contacts.get(index).getAge() + " to:");
        int age = scanner.nextInt();
        System.out.println("Update phone-number from " + contacts.get(index).getPhoneNumber() + " to:");
        String phoneNumber = scanner.next();
        System.out.println("Update Street name from " + contacts.get(index).getStreetName() + " to:");
        String streetName = scanner.next();
        System.out.println("Update Street number from " + contacts.get(index).getStreetNumber() + " to:");
        int streetNumber = scanner.nextInt();
        System.out.println("Update ZipCode from " + contacts.get(index).getZipCode() + " to:");
        int zipCode = scanner.nextInt();
        System.out.println("Update City from " + contacts.get(index).getCity() + " to:");
        String city = scanner.next();

        ContactInfo contactInfo = new ContactInfo(name, lastName, age, phoneNumber,
                streetName, streetNumber, zipCode, city);

        contacts.set(index, contactInfo);
    }

}