import java.util.Random;

/* 
Random����������������֣�ʹ������Ҳ���������裺

1.������
import java.util.Random

2.����
Random r = new Random(); // С���ŵ������ռ���

3.ʹ��
��ȡһ�������int����(��Χ��int���з�Χ������������)��int num =  r.nextInt()
��ȡһ�������int���֣����������˷�Χ������ҿ����䣩��int num = r.nextInt(3)
ʵ���ϴ���ĺ����ǣ�[0, 3)��Ҳ����0~2

*/
public class Demo77Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();

        System.out.println("������ǣ�" + num );

        for (int i = 0; i < 100; i++) {
            int num1 = r.nextInt(10);  // ��Χʵ������0~9
            System.out.println(i +"==="+num1);
        }
    }
}