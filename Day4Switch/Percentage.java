// Using switch statement JAVA Program to take the value from the user as input marks of five
//subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and
//grade according to the following:
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects::\n");

        float sub_1 = scanner.nextFloat();
        float sub_2 = scanner.nextFloat();
        float sub_3 = scanner.nextFloat();
        float sub_4 = scanner.nextFloat();
        float sub_5 = scanner.nextFloat();

        float total;
        float percentage;
        char grade;
        int sAvg;
        float average;


        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        average = (float)(total / 5.0);
        percentage = (float)((total / 500.0) * 100);
        sAvg = (int) average / 10;


        // It will calculate the Grade
        switch (sAvg) {
            case 10:
                grade = 'A';
                break;

            case 9:
                grade = 'B';
                break;

            case 8:
                grade = 'C';
                break;

            case 7:
                grade = 'D';
                break;

            case 6:
                grade = 'E';
                break;

            default:
                grade = 'F';
                break;
        }


        System.out.println("The Total marks   = " + total );
        System.out.println("The Percentage    = " + percentage );
        System.out.println("The Grade         = '" + grade );
    }
}

