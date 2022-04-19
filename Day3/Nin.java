package usingJOptionPane;

import javax.swing.*;

public class Nin {
    public static void main(String[] args) {
        int l,square;
        l= Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        square=l*l;
        JOptionPane.showMessageDialog(null,square);
    }
}
