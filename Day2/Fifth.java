//Take two integer inputs from user. First calculate the sum of two and then product.
//Finally, calculate the division of thus obtained sum and product and print the result.

import java.util.Scanner;

public class Fifth {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first, second number");
        float first = scanner.nextInt();
        float second = scanner.nextInt();
        float sum = (first+second);
        float product = (first*second);
        float division = sum/product;
        System.out.println("The sum of the two input is:" +sum);
        System.out.println("The product of the two input is:" +product);
        System.out.println("The division of the two input is:" +division);
    }

}
