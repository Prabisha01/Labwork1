//Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//check if both the conditions 'a < 50' and 'a < b' are true.

import java.util.Scanner;

public class Tweleve {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int A=scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int B=scanner.nextInt();
        System.out.println((A<B)&& (A<50));
    }
}

