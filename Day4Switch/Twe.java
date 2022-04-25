package Day4Switch;

import java.util.Scanner;

public class Twe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount,notes,x;
        System.out.print("Enter the amount ");
        amount= scanner.nextInt();
        x=amount%5;
        switch (x){
            case 0:
                notes=amount/5;
                System.out.println("The total number of notes is "+notes);
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }
    }
}
