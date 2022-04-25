package Day4Switch;

import java.util.Scanner;

public class Loss {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int SP, CP,a,x;
        System.out.print("Enter the cost price ");
        CP = scanner.nextInt();
        System.out.print("Enter the selling price ");
        SP = scanner.nextInt();
        if (SP>CP){
            x=1;
        } else{
            x=0;
        }
        switch (x){
            case 1:
                a=SP-CP;
                System.out.println("Profit: "+a);
                break;
            default:
                a=CP-SP;
                System.out.println("Loss:"+a);
        }
    }
}

