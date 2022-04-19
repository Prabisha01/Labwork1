//9. Write a program to find square of a number.
//E.g.- INPUT : 2 OUTPUT : 4
//INPUT : 5 OUTPUT : 25

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float a = scanner.nextFloat();
        double Square = a * a;
        System.out.println("The square of " + a + " is " + Square);
    }
}
