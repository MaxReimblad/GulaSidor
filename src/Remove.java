import java.util.Scanner;

public class Remove {
    public void removeOptions() {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        contact.removeContact(input);
    }
}