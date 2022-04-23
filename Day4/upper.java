//Write a JAVA program to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;

public class upper {

        public static void main(String []args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the character");
            char val = scanner.next().charAt(0);

            if (Character.isUpperCase(val)) {
                System.out.println("Character is in Uppercase!");
            }

            else {
                System.out.println("Character is in Lowercase!");
            }
        }
    }


