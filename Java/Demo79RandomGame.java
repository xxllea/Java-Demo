import java.util.Random;
import java.util.Scanner;

/* 
��Ŀ��
�ô���ģ������ֵ�С��Ϸ��

˼·��
1.������Ҫ����һ��������֣�����һ���������ٱ仯��
2.��Ҫ�������룬�����õ���Scanner
3.��ȡ������������֣���Scanner���е�nextInt����
4.�Ѿ��õ����������֣��жϣ�if��һ�£�
    ���̫���ˣ���ʾ̫�󣬲������ԣ�
    ���̫С�ˣ���ʾ̫С���������ԣ�
    ��������ˣ���Ϸ������
5.���Ծ�������һ�Σ�ѭ��������ȷ������while��true��.
*/
public class Demo79RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(1000) + 1; // [1,100]
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("������һ�����֣�");
            int num2 = sc.nextInt();
            if (num2 > num1) {
                System.out.println("̫����!");
            } else if (num2 == num1) {
                System.out.println("�¶��ˣ���Ϸ����!");
                break;
            } else {
                System.out.println("̫С��!");
            }
        }
        System.out.println("�Ѿ�����10����");
    }
}