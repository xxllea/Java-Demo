
public class Demo31LoopHourAndMinute {
    public static void main(final String[] args) {
        for (int hour = 0; hour < 24; hour++) { // ������Сʱ
            for (int minute = 0; minute < 60; minute++) { // �ڲ����Сʱ֮�ڵķ���
                for (int second = 0; second < 60; second++) {
                    System.out.println(hour + "��" + minute + "��" + second + "��");
                }
            } 
        }
        System.out.println("hello world");
    }
}