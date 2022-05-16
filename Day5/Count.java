package Day5;

import Day4Switch.Odd;

public class Count {
    public static void main(String[] args) {
        int Evencount = 0;
        int Oddcount = 0;
        for (int i = 10; i <= 30; i++) {
            if (i % 2 == 0) {
                Evencount++;
            } else
                Oddcount++;
            }
            System.out.println(Evencount);
            System.out.println(Oddcount);
        }
    }

