//Write a JAVA program to input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr the number: ");
        char character = scanner.next().charAt(0);
        scanner.close();

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.println(character + " is vowel");
            } else {
                System.out.println(character + " is consonant");
            }
        }
    }


