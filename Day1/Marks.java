//public class marks {
//    public static void main(String args[]){
//        float totalmarks, percentage, givenmarks;
//        totalmarks = 500;
//        givenmarks = 345;
//        percentage = ((givenmarks/totalmarks)*100);
//        System.out.println(percentage);
//        if (percentage>70){
//            System.out.println("First class");}
//        else if (percentage > 59){
//            System.out.println("Upper class");}
//        else if (percentage>49){
//            System.out.println("Second class");}
//        else if (percentage > 40){
//            System.out.println("Third class");}
//        else{
//            System.out.println("FAil");}

public class Marks {
    public static void main(String args[]){
        float totalmarks, percentage, givenmarks;
        totalmarks = 500;
        givenmarks = 345;
        percentage = ((givenmarks/totalmarks)*100);
        System.out.println(percentage);
        String grade;

        grade = (percentage>=70)? "First class":
                (percentage >=59 && percentage <70)? "Upper class":
                        (percentage >= 49 && percentage <59? "Second class":
                                (percentage >= 40 && percentage <49)? "Third class":
                                        "Fail");
                        System.out.println(grade);

        }
    }

