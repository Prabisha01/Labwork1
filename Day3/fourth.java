package usingJOptionPane;

import javax.swing.*;

public class fourth {
    public static void main(String[] args) {
        float x,y,sum,product;
        x=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        sum=x+y;
        product=x*y;
        JOptionPane.showMessageDialog(null,"Sum:"+sum+"\nProduct:"+product);
    }
}
