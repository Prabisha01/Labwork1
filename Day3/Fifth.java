package usingJOptionPane;

import javax.swing.*;

public class Fifth{
    public static void main(String[] args) {
        int x,y,sum,product;
        double division;
        x=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        sum=x+y;
        product=x*y;
        division=product/sum;
        JOptionPane.showMessageDialog(null,"Sum:"+sum+"\nProduct:"+product+"\nDivision:"+division);
    }
}
