import java.util.Scanner;
public class UresInput {
    public static void main(String[] args) {
        // Scanner object create karna
        Scanner scanner = new Scanner(System.in);

        // User se input lena
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        // Input ka use karna
        System.out.println("You entered: " + userInput);

        // Scanner ko close karna (optional, lekin recommended)
        scanner.close();
    }
}


