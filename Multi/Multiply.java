package Multi;

import java.util.Arrays;
import java.util.Scanner;

    public class Multiply {
        public static void main(String[] args) {
            multiply();
        }

        public static void multiply(){
            Scanner scanner= new Scanner(System.in);
            int row=2,column=3;
            int[][] A= new int[row][column];
            int[][] B= new int[row][column];
            int[][] C= new int[row][column];
            for (int i=0;i<row;i++){
                for (int j=0;j<column;j++){
                    System.out.print("Enter the number for first Array");
                    A[i][j]= scanner.nextInt();
                }
            }
            for (int i=0;i<row;i++){
                for (int j=0;j<column;j++){
                    System.out.print("Enter the number for second Array ");
                    B[i][j]= scanner.nextInt();
                }
            }
            for (int i=0;i<row;i++){
                for (int j=0;j<column;j++){
                    C[i][j]= A[i][j]*B[i][j];
                }
            }
            System.out.println("C = "+Arrays.deepToString(C));
        }
    }


