import java.util.Scanner;

// Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
public class Checktri{
    public static void main(String[] args) {

        double side1, side2, side3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Three sides of Triangle ");
        side1 = scanner.nextDouble();
        side2 = scanner.nextDouble();
        side3 = scanner.nextDouble();

        if(side1 == side2 && side2 == side3)
        {
        System.out.println("It is an Equilateral Triangle");
        }
        else if(side1 == side2 || side2 == side3 || side1 == side3)
        {
        System.out.println("It is an Isosceles Triangle");
        }
        else
        {
        System.out.println("It is a Scalene Triangle");
        }
    }
}