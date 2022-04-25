package Day4Switch;

import java.util.Scanner;

public class Maximum {
        public static void main(String[] args) {
            int x;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = scanner.nextInt();
            System.out.println("Enter the second number");
            int b = scanner.nextInt();
            if (a < b) {
                x = 1;
            } else if (b < a) {
                x = 2;
            } else {
                x = 3;
            }
            switch (x){
                case 1:
                    System.out.println(a+" is the greatest number.");
                    break;
                default:
                    System.out.println(b+" is the greatest number.");
                    break;
            }


        }
}



