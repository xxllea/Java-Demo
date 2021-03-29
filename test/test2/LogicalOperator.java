package test2;

import javax.swing.JOptionPane;

public class LogicalOperator {
    public static void main(String[] args) {
        String input1, input2;
        String s1 = "";
        boolean a, b;
        boolean ee;

        input1 = JOptionPane.showInputDialog("请输入第一个布尔值");
        input2 = JOptionPane.showInputDialog("请输入第二个布尔值");
        a = Boolean.valueOf(input1).booleanValue();
        b = Boolean.valueOf(input2).booleanValue();

        s1 = a + "&&" + b + "=" + (a&&b) + "\n";
        s1 += a + "||" + b + "=" + (a||b) + "\n";
        s1 += "!" + a + "=" + (!a) + "\n";
        s1 += a + "&" + b + "=" + (a&b) + "\n";
        s1 += a + "|" + b + "=" + (a|b) + "\n";
        s1 += a + "^" + b + "=" + (a^b);
        JOptionPane.showMessageDialog(null, s1, "逻辑运算结果", 
            JOptionPane.PLAIN_MESSAGE);
    }
}