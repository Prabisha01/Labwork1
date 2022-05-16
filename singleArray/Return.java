package singleArray;

import java.util.Arrays;
import java.util.Scanner;

public class Return {
        public static void main(String[] args) {
            String []array1=createStringArray();
            System.out.println(Arrays.toString(array1));
        }

        public static String[] createStringArray(){
            Scanner demo= new Scanner(System.in);
            String []array1=new String[10];
            for (int i=0;i<10;i++){
                System.out.print("Enter the value ");
                String a= demo.nextLine();
                array1[i]=a;
            }
            return array1;
        }

    }
