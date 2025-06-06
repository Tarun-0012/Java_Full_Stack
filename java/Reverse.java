import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String originalString = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder();

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString.append(originalString.charAt(i));
        }

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString.toString());

        scanner.close();
    }
}