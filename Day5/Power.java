package Day5;

public class Power {
        public static void main(String[] args) {

            int a = 3, b = 4;

            long result = 1;

            while (a != 0) {
                result *= b;
                --a;
            }

            System.out.println(result);
        }
    }

