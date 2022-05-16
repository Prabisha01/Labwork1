//Write the java program to find multiple of sum of 5 and 11 which are present in between a and b
// int sumMultiple(int a,int b)
public class Sure {
    public static void main(String args[]) {
        int a = 1;
        int b = 100;
        int count =0;
               System.out.println(sumMultiply(a, b,count));
    }

    public static int sumMultiply(int a, int b, int count) {
        for (int i=a; i<= b; i++) {
            if (i% 5 == 0 && i % 11 == 0) {
                count += i;
            }
        }
        return count;
    }
}

