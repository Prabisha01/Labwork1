package usingJOptionPane;
import javax.swing.*;

public class Third {
    public static void main(String[] args) {
        int F,S,T,P,total;
        double percentage;
        String result;
        F= Integer.parseInt(JOptionPane.showInputDialog("Enter your F marks "));
        S= Integer.parseInt(JOptionPane.showInputDialog("Enter your S marks "));
        T= Integer.parseInt(JOptionPane.showInputDialog("Enter your T marks "));
        P= Integer.parseInt(JOptionPane.showInputDialog("Enter your P marks "));
        total=F+S+T+P;
        percentage=total/4;
        result=percentage>69?"First Class":percentage>59?"Upper Second Class":percentage>49?"Second Class":percentage>39?"Third Class":"Fail";
        JOptionPane.showMessageDialog(null,"Total marks:"+total+"\nPercentage:"+percentage+"%"+"\n Result:"+result);
    }
}
