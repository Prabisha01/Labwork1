package Day4;

import java.util.Scanner;

public class Elictricity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double unit, amt, extra, total;
        System.out.print("Enter the unit ");
        unit = scanner.nextDouble();
        if (unit <= 50) {
            amt = unit * 0.50;
        } else if (unit <= 150) {
            amt = 25 + ((unit - 50) * 0.75);
        } else if (unit <= 250) {
            amt = 100 + ((unit - 150) * 1.20);
        } else {
            amt = 220 + ((unit - 250) * 1.50);
        }
        extra = amt * 0.2;
        total = extra + amt;
        System.out.println("The total electricity bill is Rs." + total);
    }
}