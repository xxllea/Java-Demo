/*
java���ڴ���Ҫ����Ϊ
1.ջ��Stack������ŵĶ��Ƿ����еľֲ�����������������һ��Ҫ��ջ�������С�
    �ֲ������������Ĳ����������Ƿ���{}�ڲ��ı���
    ������һ���������������̴�ջ�ڴ浱����ʧ��
2.�ѣ�Heap��������new�����Ķ��������ڶѵ��С�
    ���ڴ�����Ķ�������һ����ֵַ��16����
    ���ڴ���������ݣ�����Ĭ��ֵ������
        ���������      Ĭ��Ϊ0
        ����Ǹ�����    Ĭ��Ϊ0.0
        ������ַ�      Ĭ��Ϊ'\u0000'
        ����ǲ���      Ĭ��Ϊfalse
        �������������   Ĭ��Ϊnull
3.��������Method Area�����洢.class�����Ϣ��������������Ϣ��
4.���ط���ջ��Native Method Stack���������ϵͳ��ء�
5.�Ĵ�����pc Register��:��CPU��ء�
*/
public class Demo49ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3]; // ��̬��ʼ��
        System.out.println(array); // ��ֵַ
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
        System.out.println("=============");

        // �ı����鵱��Ԫ�ص�����
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 10
        System.out.println(array[2]); // 20

    }
}