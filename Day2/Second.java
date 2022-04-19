import java.util.Scanner;

// Write a program to calculate sum of four numbers taking user input.
public class Second {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first, second, third , fourth number");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        System.out.println("The sum of the four input are" +(first+second+third+fourth));
    }
}
