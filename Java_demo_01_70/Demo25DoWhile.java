/*
do-whileѭ���ı�׼��ʽ��

do {

} while (�����ж�);

��չ��ʽ��

��ʼ�����
do {
    ѭ����
    �������ʽ
} while (�����ж�);
*/
public class Demo25DoWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("HelloWorld " + i);
        }
        System.out.println("����ֹͣ");
        System.out.println("==============");

        int i = 1; // ��ʼ�����
        do {
            System.out.println("HelloWorld " + i); // ѭ����
            i++; // 4.�������
        } while (i <= 10); // �����ж�
        System.out.println(i); 
    }
}