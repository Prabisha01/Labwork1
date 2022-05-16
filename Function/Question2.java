package Function;

import java.util.Scanner;

public class Question2 {
        public static void main(String[] args) {
            Question2 function=new Question2();
            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter the number");
            int n= scanner.nextInt();
            function.primeCheck(n);
        }
        public void primeCheck(int num){
            int a=0;
            for (int i=2;i<num;i++){
                if (num%i==0){
                    a=1;
                    break;
                }
            }
            if (a==1){
                System.out.println(num+ " is a composite number.");
            }else{
                System.out.println(num+ " is a prime number.");
            }
        }
    }

