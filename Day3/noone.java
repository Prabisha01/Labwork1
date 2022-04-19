package usingJOptionPane;
import javax.swing.*;

public class noone {
    public static void main(String[] args) {
        String name, rollNo, age;
        name = JOptionPane.showInputDialog("Enter the name ");
        rollNo = JOptionPane.showInputDialog("Enter the roll number ");
        age = JOptionPane.showInputDialog("Enter the age ");
        JOptionPane.showMessageDialog(null, "Name:" + name + "\n Roll Number:" + rollNo + "\n Age:" + age);
    }
}
