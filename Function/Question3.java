import java.util.Scanner;

public class Question3{
    public static void main(String[] args) {
        Question3 scanner= new Question3();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter the radius");
        int rad=scanner1.nextInt();
        float areaC=scanner.area(rad);
        System.out.println("The area of the circle: "+areaC);
    }
    public float area(int r){
        float a= (3.14F*r*r);
        return a;
    }
}