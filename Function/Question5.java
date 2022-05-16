package Function;

import java.util.Scanner;

public class Question5 {
           public static void main(String[] args) {
            Question5 scanner=new Question5();
            Scanner scanner1= new Scanner(System.in);
            System.out.print("Enter the principle ");
            int p=scanner1.nextInt();
            System.out.print("Enter the rate ");
            int r=scanner1.nextInt();
            System.out.print("Enter the time ");
            int t=scanner1.nextInt();
            int SI= scanner.simpleInterest(p,t,r);
            System.out.println("Simple Interest: "+SI);
        }
        public int simpleInterest(int p,int t,int r){
            int SI=(p*t*r)/100;
            return SI;

        }

    }
