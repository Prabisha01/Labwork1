//Write a JAVA program to check whether a number is negative, positive or zero

import java.util.Scanner;

public class Check {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        if (a>0) {
            System.out.println("The number is positive");
        }
        else if(a<0) {
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");

        }

    }
}
