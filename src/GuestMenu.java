import java.util.Scanner;

public class GuestMenu implements MenuOptions{
    Scanner scanner = new Scanner(System.in);
    Search search = new Search();
    PrintedSpacing spacing = new PrintedSpacing();
    public void printGuestOptions() throws InterruptedException {

        boolean backToMainMenu = false;

        do {
            System.out.println("""
                    -------------------------------------
                    Welcome Guest!
                    1. Search
                    2. Go back
                    """);
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> {
                    search.searchOptions();
                    spacing.print();
                }
                case "2" -> {
                    System.out.println("...");
                    backToMainMenu = true;}
                default -> System.out.println("That's not an option!");
            }
        } while (!backToMainMenu);

    }
}