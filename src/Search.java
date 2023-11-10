import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Search {
    Scanner scanner = new Scanner(System.in);
    public void searchOptions() throws InterruptedException {


        boolean goBack = false;
        do {
            System.out.println("""
            -------------------------------------
            Do you want to:
            1. Search by First Name
            2. Search by Last Name
            3. Search by Address
            4. Free Search
            5. Go back
            """);
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> firstNameSearch();
                case "2" -> lastNameSearch();
                case "3" -> addressSearch();
                case "4" -> freeSearch();
                case "5" -> {
                    System.out.println("...");
                    goBack = true;
                }
                default -> System.out.println("That's not an option!");
            }
        } while (!goBack);
    }
        public void firstNameSearch() throws InterruptedException {
            System.out.println("Enter the name you would like to search for:");
            String firstName = scanner.nextLine();
            firstName = firstName.toLowerCase();
            System.out.println("*** Searching for " + firstName + " ***\n");
            TimeUnit.SECONDS.sleep(2);
            boolean doesExist = false;
            for (int i = 0; i < Contact.contacts.size(); i++) {
                if (Contact.contacts.get(i).getFirstName().toLowerCase().startsWith(firstName)) {
                    System.out.println("First Name: " + Contact.contacts.get(i).getFirstName());
                    System.out.println("Last Name: " + Contact.contacts.get(i).getLastName());
                    System.out.println("Age: " + Contact.contacts.get(i).getAge());
                    System.out.println("Phone: " + Contact.contacts.get(i).getPhoneNumber());
                    System.out.println(Contact.contacts.get(i).getAddress().substring(2));
                    System.out.println();
                    doesExist = true;
                }
            }
            if (!doesExist) {
                System.out.println("*** Could not find anyone named " + firstName + " ***");
            }
            TimeUnit.SECONDS.sleep(2);
        }

        public void lastNameSearch() throws InterruptedException {
            System.out.println("Enter the name you would like to search for:");
            String lastName = scanner.nextLine();
            lastName = lastName.toLowerCase();
            System.out.println("*** Searching for " + lastName + " ***\n");
            TimeUnit.SECONDS.sleep(2);
            boolean doesExist = false;
            for (int i = 0; i < Contact.contacts.size(); i++) {
                if (Contact.contacts.get(i).getFirstName().toLowerCase().startsWith(lastName)) {
                    System.out.println("First Name: " + Contact.contacts.get(i).getFirstName());
                    System.out.println("Last Name: " + Contact.contacts.get(i).getLastName());
                    System.out.println("Age: " + Contact.contacts.get(i).getAge());
                    System.out.println("Phone: " + Contact.contacts.get(i).getPhoneNumber());
                    System.out.println(Contact.contacts.get(i).getAddress().substring(2));
                    doesExist = true;
                }
            }
            if (!doesExist) {
                System.out.println("*** Could not find anyone named " + lastName + " ***");
            }
            TimeUnit.SECONDS.sleep(2);
        }

        public void addressSearch() throws InterruptedException {
            System.out.println("Enter street name:");
            String streetName = scanner.nextLine();
            streetName = streetName.toLowerCase();
            System.out.println("*** Searching for " + streetName + " ***\n");
            TimeUnit.SECONDS.sleep(2);
            boolean doesExist = false;
            for (int i = 0; i < Contact.contacts.size(); i++) {
                if (Contact.contacts.get(i).getFirstName().toLowerCase().startsWith(streetName)) {
                    System.out.println("First Name: " + Contact.contacts.get(i).getFirstName());
                    System.out.println("Last Name: " + Contact.contacts.get(i).getLastName());
                    System.out.println("Age: " + Contact.contacts.get(i).getAge());
                    System.out.println("Phone: " + Contact.contacts.get(i).getPhoneNumber());
                    System.out.println(Contact.contacts.get(i).getAddress().substring(2));
                    doesExist = true;
                }
            }
            if (!doesExist) {
                System.out.println("*** Could not find any street named " + streetName + " ***");
            }
            TimeUnit.SECONDS.sleep(2);
        }

        public void freeSearch() throws InterruptedException {
            System.out.println("Enter anything to search for:");
            String freeSearch = scanner.nextLine();
            freeSearch = freeSearch.toLowerCase();
            System.out.println("*** Searching for " + freeSearch + " ***\n");
            TimeUnit.SECONDS.sleep(2);
            boolean doesExist = false;
            for (int i = 0; i < Contact.contacts.size(); i++) {
                if (Contact.contacts.get(i).getFirstName().toLowerCase().startsWith(freeSearch) ||
                        Contact.contacts.get(i).getLastName().toLowerCase().startsWith(freeSearch) ||
                        Contact.contacts.get(i).getAddress().toLowerCase().contains(freeSearch) ||
                        Contact.contacts.get(i).getPhoneNumber().contains(freeSearch)
                ) {
                    System.out.println("First Name: " + Contact.contacts.get(i).getFirstName());
                    System.out.println("Last Name: " + Contact.contacts.get(i).getLastName());
                    System.out.println("Age: " + Contact.contacts.get(i).getAge());
                    System.out.println("Phone: " + Contact.contacts.get(i).getPhoneNumber());
                    System.out.println(Contact.contacts.get(i).getAddress().substring(2));
                    doesExist = true;
                }
            }
            if (!doesExist) {
                System.out.println("*** Could not find anything with " + freeSearch + " ***");
            }
            TimeUnit.SECONDS.sleep(2);
        }
}