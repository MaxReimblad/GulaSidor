import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AdminMenu implements MenuOptions {
    Scanner scanner = new Scanner(System.in);
    Search search = new Search();
    Add add = new Add();
    Remove remove = new Remove();
    Update update = new Update();
    PrintContacts printContacts = new PrintContacts();
    PrintedSpacing spacing = new PrintedSpacing();

    public void print() throws InterruptedException {
        boolean backToMainMenu = false;
        do {
            System.out.println("""
                    -------------------------------------
                    Welcome Admin!
                    1. Search
                    2. Add
                    3. Remove
                    4. Update
                    5. Go back
                    """);
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> {
                    search.searchOptions();
                    spacing.print();
                }
                case "2" -> {
                    add.addOptions();
                    System.out.println("*** Contact is being added ***");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("*** Contact added ***");
                }
                case "3" -> {
                    printContacts.printContacts();
                    System.out.println("Please type in the index of the contact you want to remove...");
                    remove.removeOptions();
                    System.out.println("*** Contact is being removed ***");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("*** Contact removed ***");
                }
                case "4" -> {
                    printContacts.printContacts();
                    System.out.println("Please type in the index of the contact you want to update...");
                    update.updateOptions();
                    System.out.println("*** Contact is being updated ***");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("*** Contact updated ***");
                }
                case "5" -> {
                    System.out.println("...");
                    backToMainMenu = true;
                }
                case "42" -> {
                    System.out.println("Hidden option initiated; showing the list...\n");
                    printContacts.printContacts();
                    TimeUnit.SECONDS.sleep(2);
                }
                default -> System.out.println("That's not an option!");
            }

        } while (!backToMainMenu);
    }
}