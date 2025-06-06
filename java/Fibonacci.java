import java.util.Scanner;

class Fibonacci {

    
    public static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        int root = (int) Math.sqrt(n);
        return (root * root == n);
    }

    
    public static boolean isFibonacci(int n) {
        
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Fibonacci number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println(num + " is not a Fibonacci number (Fibonacci sequence usually deals with non-negative integers).");
        } else if (num == 0 || num == 1) {
            System.out.println(num + " is a Fibonacci number.");
        } else {
            if (isFibonacci(num)) {
                System.out.println(num + " is a Fibonacci number.");
            } else {
                System.out.println(num + " is not a Fibonacci number.");
            }
        }

        scanner.close();
    }
}