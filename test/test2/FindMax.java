package test2;

import javax.swing.JOptionPane;

public class FindMax {
    public static void main(String[] args) {
        String input1, input2, input3;
        int a, b, c, max;
        
        input1 = JOptionPane.showInputDialog("�����һ����");
        input2 = JOptionPane.showInputDialog("����ڶ�����");
        input3 = JOptionPane.showInputDialog("�����������");
        a = Integer.parseInt(input1);
        b = Integer.parseInt(input2);
        c = Integer.parseInt(input3);
        
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        JOptionPane.showMessageDialog(null, a + "," + b + "," + c +"�е�������ǣ�" 
            + max, "��������", JOptionPane.PLAIN_MESSAGE);
    }
}