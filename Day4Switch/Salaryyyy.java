package Day4Switch;

import java.util.Scanner;

public class Salaryyyy {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double da,hra,basic,gross;
        int temp;
        System.out.print("Enter the basic salary ");
        basic= scanner.nextDouble();
        if(basic <= 10000)
        {
            temp=1;
        }
        else if(basic <= 20000)
        {
            temp=2;
        }
        else
        {
            temp=3;
        }
        switch (temp){
            case 1:
                da  = basic * 0.8;
                hra = basic * 0.2;
                break;
            case 2:
                da  = basic * 0.9;
                hra = basic * 0.25;
                break;
            default:
                da  = basic * 0.95;
                hra = basic * 0.3;
                break;
        }
        gross = basic + hra + da;
        System.out.println("The gross salary is Rs."+gross);
    }
}

