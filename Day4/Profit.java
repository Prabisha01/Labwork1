//8. Write a JAVA program to calculate profit or loss.

import java.util.Scanner;

public class Profit {
    public static void main(String args[])
    {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Costprice ");
        double cp=scanner.nextDouble();
        System.out.println("Enter the Selling price:");
        double sp=scanner.nextDouble();

        if(cp-sp>0)
        {
            System.out.println("loss:" +(cp-sp));
        }
        else if(cp-sp<0)
        {
            System.out.println("profit:" +(sp-cp));
        }
        else

            System.out.println("NEUTRAL");

    }
}

