//. Write a JAVA program to check whether a year is leap year or not.

import java.util.Scanner;

public class Leap {
        public static void main(String[] args){
            int year;
            System.out.println("Enter an Year :: ");
            Scanner scanner = new Scanner(System.in);
            year = scanner.nextInt();

            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                System.out.println("Is a leap year");
            else
                System.out.println("Is not a leap year");
        }
    }