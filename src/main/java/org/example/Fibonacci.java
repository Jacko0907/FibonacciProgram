package org.example;
import java.util.Scanner;


/**
 * demonstrates a recursive method for finding terms in the Fibonacci sequence.
 */
public class Fibonacci {

    /**
     * recursively calculates the nth term in the Fibonacci sequence.
     *
     * @param n the position of the term to calculate
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
     if (n <= 1) {
         return n;
     }
        return fibonacci(n - 1) + fibonacci(n - 2);
}
    /** scanner to look for user input and output the term in hte position the user chooses */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci calculator");
        System.out.print("Enter a term number: ");
        int n = scanner.nextInt();

        // Added an if statement to check for negative integers

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            scanner.close();
            return;
        }

        int result = fibonacci(n);
        System.out.println("*******************************************************");
        System.out.println("The Calculation complete!");
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
        System.out.println("********************************************************");

        // Keep the container running until user presses Enter
        scanner.nextLine();
        System.out.println("Press Enter to exit");
        scanner.nextLine();

        scanner.close();
    }

}