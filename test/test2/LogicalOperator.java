package test2;

import javax.swing.JOptionPane;

public class LogicalOperator {
    public static void main(String[] args) {
        String input1, input2;
        String s1 = "";
        boolean a, b;
        boolean ee;

        input1 = JOptionPane.showInputDialog("�������һ������ֵ");
        input2 = JOptionPane.showInputDialog("������ڶ�������ֵ");
        a = Boolean.valueOf(input1).booleanValue();
        b = Boolean.valueOf(input2).booleanValue();

        s1 = a + "&&" + b + "=" + (a&&b) + "\n";
        s1 += a + "||" + b + "=" + (a||b) + "\n";
        s1 += "!" + a + "=" + (!a) + "\n";
        s1 += a + "&" + b + "=" + (a&b) + "\n";
        s1 += a + "|" + b + "=" + (a|b) + "\n";
        s1 += a + "^" + b + "=" + (a^b);
        JOptionPane.showMessageDialog(null, s1, "�߼�������", 
            JOptionPane.PLAIN_MESSAGE);
    }
}