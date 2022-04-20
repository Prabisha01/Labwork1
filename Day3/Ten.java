package usingJOptionPane;

import javax.swing.*;


public class Ten {
    public static void main(String[] args) {
        String name, last;
        name = JOptionPane.showInputDialog("Enter the name: ");
        last = JOptionPane.showInputDialog("Enter the last: ");
        JOptionPane.showMessageDialog(null, name + "" + last);
    }
}