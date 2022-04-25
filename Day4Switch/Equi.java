package Day4Switch;

import java.util.Scanner;

public class Equi {
    public static void main(String[] args) {
        double r1, r2,a,b,c,determinant,sqrt;
        int det1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a ::");
        a= scanner.nextDouble();
        System.out.println("Enter the value of b ::");
        b= scanner.nextDouble();
        System.out.println("Enter the value of c ::");
        c = scanner.nextDouble();
        determinant = (b*b)-(4*a*c);
        sqrt = Math.sqrt(determinant);
        if (determinant==0)
        {
            det1=0;
        }
        else {
            det1=1;
        };
        switch (det1){
            case 0:
                System.out.println("Root is :: "+(-b + sqrt)/(2*a));
                break;
            default:
                r1 = (-b + sqrt)/(2*a);
                r2 = (-b - sqrt)/(2*a);
                System.out.println("Roots are :: "+ r1 +" and "+r2);
                break;
        }
    }
}

