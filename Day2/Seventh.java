//Take name, roll number and field of interest from user and print in the format below :Hey,
//my name is xyz and my roll number is xyz. My field of interest are xyz.

import java.util.Scanner;

public class Seventh {
        public static void main (String args []) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name, roll, field of interest");
            String name = scanner.nextLine();
            int roll = scanner.nextInt();
            String interest = scanner.nextLine();

            System.out.println("Hey, My name is " +name+ "and my roll number is" +roll+ " "+". My field of interest are" +interest);
        }
}
