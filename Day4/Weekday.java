//Write a JAVA program to input week number and print weekday.

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weekday day number (1-7) : ");
        int weekday = scanner.nextInt();

        if(weekday == 1) {

            System.out.println("Monday");

        } else if(weekday == 2) {

            System.out.println("Tuesday");

        } else if(weekday == 3) {

            System.out.println("Wednesday");

        } else if(weekday == 4) {

            System.out.println("Thursday");

        } else if(weekday == 5) {

            System.out.println("Friday");

        } else if(weekday == 6) {
            System.out.println("Saturday");

        } else {

            System.out.println("Sunday");

        }

    }
}

