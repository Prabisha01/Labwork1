//Write a JAVA program to find maximum between two numbers
import java.util.Scanner;

public class Max {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number;");
        int first = scanner.nextInt();
        System.out.print("Enter the first number;");
        int second = scanner.nextInt();
        // prints the maximum of two numbers
        System.out.println(Math.max(first , second));

    }
}
