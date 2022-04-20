//Write a JAVA program to find maximum between three numbers.
import java.util.Scanner;

public class Maxthree {
        public static void main(String[] args)
        {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = scanner.nextInt();
            System.out.println("Enter the second number");
            int b = scanner.nextInt();
            System.out.println("Enter the third number");
            int c = scanner.nextInt();

            if(a>=b && a>=c)
                System.out.println(a+" is the largest Number");

            else if (b>=a && b>=c)
                System.out.println(b+" is the largest Number");
            else

                System.out.println(c+" is the largest number");
        }
    }
