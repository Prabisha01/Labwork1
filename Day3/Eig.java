package usingJOptionPane;

import javax.swing.*;
import java.util.Scanner;

public class Eig {
    public static void main(String[] args) {
        double l , area, perimeter;
        l=Double.parseDouble(JOptionPane.showInputDialog("Enter the length: "));
        area = l*l;
        perimeter = 4l;
        int castedarea = (int)(area);
        int castedperimeter = (int)(perimeter);
        JOptionPane.showMessageDialog(null,castedarea);
        JOptionPane.showMessageDialog(null,castedperimeter);


    }
}
class Simple {
    public static void main(String[] args) {
        double r, p, t, SI;
        p = Double.parseDouble(JOptionPane.showInputDialog("Enter the principle: "));
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter the rate: "));
        t = Double.parseDouble(JOptionPane.showInputDialog("Enter the time: "));
        SI = ((p * r * t) / 100);
        int castedSI = (int) (SI);

        JOptionPane.showMessageDialog(null, castedSI);

    }
}
