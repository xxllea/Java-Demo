/*
whileѭ����һ����׼��ʽ������һ����չ��ʽ��

��׼��ʽ��
while (�����ж�) {
    ѭ����
}

��չ��ʽ��
��ʼ�����;
while (�����ж�) {
    ѭ����;
    �������;
}
*/
public class Demo24While {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("HelloWorld " + i);
        }
        System.out.println("����ֹͣ");
        // System.out.println(i); // ���󣡳�������������
        System.out.println("=============");

        int i = 1;
        while (i <= 10) {
            System.out.println("HelloWorld " + i);
            i++;
        }
        System.out.println(i);
    }
}