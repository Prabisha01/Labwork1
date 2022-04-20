
//10. Take two different string input and print them in same line. E.g.-
//INPUT : Codes
//Dope
//OUTPUT : CodesDope

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String A = scanner.nextLine();
        System.out.println("Enter the Last Name: ");
        String B = scanner.nextLine();
        System.out.println(A+""+B);
    }
}
