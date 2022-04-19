//3. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks.

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Marks : ");
        float A = scanner.nextFloat();
        System.out.println("Enter the Second Marks: ");
        float B = scanner.nextFloat();
        System.out.println("Enter the Second Marks: ");
        float C = scanner.nextFloat();
        float sum = A + B + C;
        System.out.println("the total marks is " + sum);
        float percent=sum/3;
        System.out.println("the percent scored is "+percent);
    }
}

