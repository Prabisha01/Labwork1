package usingJOptionPane;
import javax.swing.*;

public class Thir {
    public static void main(String[] args) {
        int F,S,T,P,total;
        double percentage;
        String result;
        F= Integer.parseInt(JOptionPane.showInputDialog("Enter your F marks "));
        S= Integer.parseInt(JOptionPane.showInputDialog("Enter your S marks "));
        T= Integer.parseInt(JOptionPane.showInputDialog("Enter your T marks "));

        total=F+S+T;
        percentage=total/3;
        JOptionPane.showMessageDialog(null,"Total marks:"+total+"\nPercentage:"+percentage+"%");
    }
}