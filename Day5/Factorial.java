package Day5;

import java.util.Scanner;

public class Factorial {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int num;
            int fact = 1;

            System.out.print("Enter any positive integer: ");
            num = scanner.nextInt();

            for(int i=1; i<=num; i++)
            {
                fact *= i;
            }

            System.out.println("Factorial: "+ fact);
        }
    }

