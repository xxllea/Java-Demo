import java.util.Scanner;  // 1.����

/* 
Scanner��Ĺ��ܣ�����ʵ�ּ����������ݣ���������

�������͵�һ��ʹ�ò��裺
1.����
import ��·��.������;
���ʹ�õ�Ŀ���࣬�͵�ǰ��λ��ͬһ�����£������ʡ�Ե�����䲻д
ֻ��java.lang��������ݲ���Ҫ�����������Ķ���Ҫimport��䡣

2.����
������ ������ = new ������();

3.ʹ��
������.��Ա������();

��ȡ���������һ��int���֣�int num = sc.nextInt();
��ȡ���������һ���ַ�����String str = sc.next();
*/

public  class Demo72Scanner {
    public static void main(String[] args) {
        // 2.����
        // ��ע��System.in����Ӽ��̽�������
        Scanner sc = new Scanner(System.in);

        // 3.��ȡ���������int����
        int num = sc.nextInt();
        System.out.println("�����int�����ǣ�" + num);

        // 4.��ȡ���������String�ַ���
        String str = sc.next();
        System.out.println("������ַ����ǣ�" + str);
    }
}