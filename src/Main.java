import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    Contact contact = new Contact();
    GuestMenu guestMenu = new GuestMenu();
    AdminMenu adminMenu = new AdminMenu();
    PrintedSpacing spacing = new PrintedSpacing();
    Scanner scanner = new Scanner(System.in);
    contact.premadeContacts();

        boolean quit = false;

        do {
            System.out.println("""
                -------------------------------------
                Welcome to the Yellow Pages
                Do you want to:
                1. Continue as Guest
                2. Login as Admin
                3. Quit
                """);
            String menuStart = scanner.nextLine();
            switch (menuStart) {
                case "1" -> {
                    guestMenu.printGuestOptions();
                    spacing.print();
                }
                case "2" -> {
                    System.out.print("Password: ");
                    String inputPassword = scanner.nextLine();
                    if (Objects.equals(inputPassword, LogIn.password)){
                        adminMenu.print();
                        spacing.print();
                    }else {
                        System.out.println("Incorrect password");
                        spacing.print();
                        TimeUnit.SECONDS.sleep(4);
                    }

                }
                case "3" -> {
                    System.out.println("Good bye!");
                    quit = true;
                }
                default -> System.out.println("That's not an option!");
            }
        } while (!quit);
    }
}