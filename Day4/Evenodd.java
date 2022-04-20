//Write a JAVA program to check whether a number is even or odd
import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("The num is even number");
        } else {

            System.out.println("The num is odd number");
        }
    }
}

