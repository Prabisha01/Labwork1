import java.util.Scanner;

//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
public class Eight {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System .in);
            System.out.println("Enter the length of square: ");
            float l =scanner.nextFloat();
            float Area=l*l;
            float perimeter=4*l;
            System.out.println("the area is "+Area);
            System.out.println("the perimeter is "+perimeter);


        }
    }
    class Simple{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the Principle: ");
            String p=scanner.nextLine();

            System.out.println("enter the Time: ");
            String t=scanner.nextLine();


            System.out.println("enter the Rate: ");
            String r=scanner.nextLine();

            int aa=Integer.parseInt(p);
            int pp=Integer.parseInt(t);
            int cc=Integer.parseInt(r);
            float SI=(aa*pp*cc)/100;
            System.out.println(SI);

        }
    }
    class AreaTriangle{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the length: ");
            double length=scanner.nextDouble();
            System.out.println("Enter the breadth: ");
            double breadth  =scanner.nextDouble();
            double Area=(0.5)*(length*breadth);
            System.out.println(Area+" square cm");
        }
    }

    class Volumecube{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the length of cube: ");
            double length=scanner.nextDouble();
            double Volume=length*length*length;
            System.out.println("The volume of cube is "+ Volume);
        }
    }

    class Volumecuboid{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the length: ");
            double length=scanner.nextDouble();
            System.out.println("Enter the breadth: ");
            double breadth  =scanner.nextDouble();
            System.out.println("Enter the height: ");
            double height  =scanner.nextDouble();

            double Volume= length*breadth*height;
            System.out.println("The volume of cuboid is "+ Volume);
        }
}

