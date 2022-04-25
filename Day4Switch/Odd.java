package Day4Switch;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        int odd = a % 2;
        switch (odd) {
            case 1:
                System.out.println("It is odd.");
                break;
            default:
                System.out.println("The number is even.");
                break;
        }
    }
}
