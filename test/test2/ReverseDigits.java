package test2;

import javax.swing.JOptionPane;

public class ReverseDigits {
    public static void main(String[] args) {
        int n, rightDigit;
        String str = JOptionPane.showInputDialog("Input a integer number:");
        n = Integer.parseInt(str);
        String output = "";
        do {
            rightDigit = n % 10;
            output = output + rightDigit;
            n /= 10;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "The reverse digits is£º" + output, "½á¹û",
             JOptionPane.PLAIN_MESSAGE);
    }
}