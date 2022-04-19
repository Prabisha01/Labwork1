package Day2;

//11. Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator )

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int A=scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int B=scanner.nextInt();
        System.out.println("Enter the third Number: ");
        int C=scanner.nextInt();

        String check=((A==B)&&(A==C)) ?"All three are equal": (A==B)?"A and B are equal":(A==C)?"A and C are Equal":(B==C)?"B ans C are equal":"no thing is equal";
        System.out.println(check);
    }

}
