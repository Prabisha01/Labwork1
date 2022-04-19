//Write a program to take input of the total marks of four subjects of a student and calculate
//the total percentage secured. Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.

import java.util.Scanner;

public class Third {
    public static void main(String arg []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first , second , third, fourth marks");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        int totalmarks = (first+second +third +fourth);
        int percentage = (totalmarks/4);
        System.out.println(percentage+"%");
        String grade;

        grade = (percentage>=70)? "First class":
                (percentage >=59 && percentage <70)? "Upper class":
                        (percentage >= 49 && percentage <59? "Second class":
                                (percentage >= 40 && percentage <49)? "Third class":
                                        "Fail");
        System.out.println(grade);
    }
}
