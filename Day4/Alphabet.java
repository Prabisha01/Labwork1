//Write a JAVA program to check whether a character is alphabet or not.

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        char character;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        character = scanner.next().charAt(0);
        scanner.close();

        // checks if character is an alphabet
        if (Character.isAlphabetic(character)) {
            System.out.println(character + " is an alphabet.");
        } else {
            System.out.println(character + " is not an alphabet.");
        }
    }
}