package Day4Switch;

import java.util.Scanner;

public class Equalitarel {
    public static void main(String[] args) {

        double side1, side2, side3;
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Three sides of Triangle ");
        side1 = scanner.nextDouble();
        side2 = scanner.nextDouble();
        side3 = scanner.nextDouble();

        if (side1 == side2 && side2 == side3) {
            x = 1;
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            x = 2;
        } else {
            x = 3;
        }
        switch (x) {
            case 1:
                System.out.println("The triangle is equilateral");

            case 2:
                System.out.println("The triangle is isosceles");
                break;
            default:
                System.out.println("The number is scalene");
                break;
        }
    }
}

