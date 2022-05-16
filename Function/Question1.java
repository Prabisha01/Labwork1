package Function;

import java.util.Scanner;

public class Question1 {
        public static void main(String[] args) {
            int pro;
            Question1 scanner=new Question1();
            pro=scanner.products();
            System.out.println("The product: "+pro);

        }
        public int products(){
            Scanner scanner= new Scanner(System.in);
            int p=1;
            for (int i=1;i<4;i++){
                System.out.println("Enter the number ");
                int x= scanner.nextInt();
                p*=x;
            }
            return p;
        }
    }

