package Day4Switch;

import java.util.Scanner;

public class Alpha {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the character ");
        char char1;
        char1 = scanner.next().charAt(0);
        Character.toLowerCase(char1);
        switch (char1) {
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z':
                System.out.println("The character is an alphabet.");
                break;
            default:
                System.out.println("The character is not an alphabet.");
        }
    }
}

