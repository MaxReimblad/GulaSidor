import java.util.Scanner;

public class Update {
    public void updateOptions() {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        contact.updateContact(input);
    }
}