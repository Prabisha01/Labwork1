package Function;

import java.util.Scanner;

public class Question4 {
        public static void main(String[] args) {
            Question4 function=new Question4();
            function.simpleInterest();
        }
        public void simpleInterest(){
            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter the principal ");
            int p=scanner.nextInt();
            System.out.print("Enter the rate ");
            int r=scanner.nextInt();
            System.out.print("Enter the time ");
            int t=scanner.nextInt();
            int SI=(p*t*r)/100;
            System.out.println("Simple Interest: "+SI);
        }
    }

