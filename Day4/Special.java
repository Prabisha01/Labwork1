//Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character

import java.util.Scanner;

public class Special {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is alphabet.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is digit.");

        } else {

            System.out.println(ch + " is special character.");
        }

    }
}

