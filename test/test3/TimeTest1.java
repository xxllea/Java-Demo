package test3;

import javax.swing.JOptionPane;

public class TimeTest1 {
    public static void main(final String[] args) {
        Time1 time1 = new Time1();
        String output = "time1��������\nʱ�䣺" + time1.toString();
        time1.setTime(13, 27, 6);
        output += "\n��setTime������13��27��6���޸�time1�����\nʱ�䣺" 
            + time1.toString();
        
        Time1 time2 = new Time1();
        //����time2�����ֵ
        time2.setTime(11, 27, 12);
         output += "\n\ntime2����\nʱ�䣺" + time2.toString();
        time2.setTime(99, 89, 99);
        output += "\n��setTime������99��89��99���޸�time2�����\nʱ�䣺" 
            + time2.toString();
        JOptionPane.showMessageDialog(null, output, "ʱ������ԣ���������ʱ�Ӷ���",
            JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}