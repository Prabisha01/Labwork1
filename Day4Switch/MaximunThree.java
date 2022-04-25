package Day4Switch;

import java.util.Scanner;

//JAVA Program to find the maximum between three numbers
public class MaximunThree {


    //JAVA Program to find the maximum between three numbers
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n1,n2,n3,x;
            System.out.print("Enter the first number ");
            n1=scanner.nextInt();
            System.out.print("Enter the second number ");
            n2=scanner.nextInt();
            System.out.print("Enter the third number ");
            n3= scanner.nextInt();
            if (n1>=n2 && n1>=n3){
                x=1;

            } else if (n2>=n1 && n2>=n3) {
                x=2;
            } else {
                x=3;
            }
            switch (x){
                case 1:
                    System.out.println(n1+" is the greatest number.");
                    break;
                case 2:
                    System.out.println(n2+" is the greatest number.");
                    break;
                default:
                    System.out.println(n3+" is the greatest number.");
                    break;

            }
        }
    }

