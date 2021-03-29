package test2;

import javax.swing.JOptionPane;

public class LeapYear {
    public static void main(String[] args) {
        String sYear;
        int year;
        boolean isLeapYear;
        
        sYear = JOptionPane.showInputDialog("Enter the year:");
        year = Integer.parseInt(sYear);
        isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            sYear = year + " is a leap year";
        } else {
            sYear = year + " is not a leap year"; 
        }
        JOptionPane.showMessageDialog(null, sYear, "½á¹û", JOptionPane.PLAIN_MESSAGE);

    }
}