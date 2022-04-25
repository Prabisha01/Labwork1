package Day4Switch;

import java.util.Scanner;

public class Dividle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,x;
        System.out.print("Enter the number ");
        num= scanner.nextInt();
        if ((num%5==0)&(num%11==0)){
            x=1;
        }
        else {
            x=0;
        }
        switch (x){
            case 1:
                System.out.println("The number is divisible by 5 and 11.");
                break;
            default:
                System.out.println("The number is not divisible by both 5 and 11.");
                break;
        }
    }
}
