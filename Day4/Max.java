//Write a JAVA program to find maximum between two numbers
import java.util.Scanner;

public class Max {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number;");
        int a = scanner.nextInt();
        System.out.print("Enter the first number;");
        int b = scanner.nextInt();
        // prints the maximum of two numbers
        if (a > b) {
            System.out.println(a + " is the greatest number.");
        } else {
            System.out.println(b + " is the greatest number.");
        }
    }
}