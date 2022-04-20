package Day3;

import javax.swing.*;


public class Twe {
    public static void main(String[] args) {
        int a, b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

        JOptionPane.showMessageDialog(null,(a<b)&& (a<50));
    }
}

