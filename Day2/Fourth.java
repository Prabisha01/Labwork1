import java.util.Scanner;

//Write a program to take two integer inputs from user and print sum and product of them
public class Fourth {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first, second number");
        float first = scanner.nextInt();
        float second = scanner.nextInt();
        System.out.println("The sum of the two input is:" +(first+second));
        System.out.println("The product of the two input is:" +(first/second));
    }

}
