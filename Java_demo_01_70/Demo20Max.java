// ��Ԫ��������Ժ�if-else��Ч�滻
// ���ӣ�ȡ�������ֵ��е����ֵ

public class Demo20Max {
    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       
       // ����ʹ����Ԫ����� 
       // int max = a > b ? a : b;

       // ʹ��if���
       int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("���ֵ��" + max);
    }
}