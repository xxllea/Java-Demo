package test2;

import javax.swing.JOptionPane;

public class ArithmeticOperator {
    public static void main(final String[] args) {
        String input1;
        final String input2;
        final int a, b, plus, minus;

        input1 = JOptionPane.showInputDialog("请输入第一个数");
        input2 = JOptionPane.showInputDialog("请输入第二个数");
        a = Integer.parseInt(input1);
        b = Integer.parseInt(input2);
        plus = a + b;
        minus = a - b;

        String s1 = a + "+" + b + "=" + plus + "\n";
        s1 += a + "-" + b + "=" + minus + "\n";
        s1 += a + "*" + b + "=" + (a*b) + "\n";
        s1 += a + "/" + b + "=" + (a/b) + "\n";
        s1 += a + "%" + b + "=" + (a%b) + "\n";
        JOptionPane.showMessageDialog(null, s1, "算术运算结果", 
            JOptionPane.PLAIN_MESSAGE);
    }

}