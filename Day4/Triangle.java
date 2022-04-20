//. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.

import java.util.Scanner;

public class Triangle {
    public static void main(String args []){

            int ang1, ang2, ang3, total;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Triangles First, Second & Thrid Angles = ");
            ang1 = scanner.nextInt();
            ang2 = scanner.nextInt();
            ang3 = scanner.nextInt();

            total = ang1 + ang2 + ang3;

            if (total == 180) {
                System.out.println("It is a Valid Triangle");
            }
            else {
                System.out.println("It is Not a Valid Triangle");
            }
        }
    }

