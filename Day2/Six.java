//Ask user to give two double input for length and breadth of a rectangle and print area type
 //       casted to int.

import java.util.Scanner;

public class Six {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth: ");
        double breadth = scanner.nextDouble();
        double area = (length *breadth);
        int castedarea = (int)(area);
        System.out.println("The area of rectangle " +castedarea);
    }
}
