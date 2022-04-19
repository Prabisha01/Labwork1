//Write a program to take student details as input and display the result.

import java.util.Scanner;

public class First {
    public static void main (String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name, age, phonenumber ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int phonenumber = scanner.nextInt();
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +phonenumber);

    }

}
