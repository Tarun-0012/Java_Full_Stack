import java.util.Scanner;
import java.lang.Math;

class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of side a:");
        double a = input.nextDouble();

        System.out.println("Enter the length of side b:");
        double b = input.nextDouble();

        System.out.println("Enter the length of side c:");
        double c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double perimeter = a + b + c;

            double s = perimeter / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("\n--- Triangle Details ---");
            System.out.printf("Side a: %.2f%n", a);
            System.out.printf("Side b: %.2f%n", b);
            System.out.printf("Side c: %.2f%n", c);
            System.out.printf("Perimeter: %.2f units%n", perimeter);
            System.out.printf("Area: %.2f square units%n", area);
        } else {
            System.out.println("\nError: The given side lengths do not form a valid triangle.");
            System.out.println("Please ensure that the sum of any two sides is greater than the third side.");
        }

        input.close();
    }
}