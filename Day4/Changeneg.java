package Day4;

import java.util.Scanner;

public class Changeneg {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int num, x, num1;
        System.out.println("Enter the number ");
        num = demo.nextInt();
        if (num < 0) {
            x = -1;
        } else if (num == 0) {
            x = 0;
        } else {
            x = 1;
        }

    }
}