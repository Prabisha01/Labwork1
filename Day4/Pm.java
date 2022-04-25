package Day4;

import java.util.Scanner;

public class Pm {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int h,x;
        System.out.println("Enter the hours ");
        h= scanner.nextInt();
        if (h>=12&& h<24){
            x=1;
        } else{
            x=0;
        }
        switch (x){
            case 0:
                System.out.println("The time is in AM ");
                break;
            default:
                System.out.println("The time is in PM ");
                break;
        }

    }
}

