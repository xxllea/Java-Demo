import java.util.Random;

/* 
��ĿҪ��
����int����n��ֵ������ȡ������֣���Χ��[1,n],����ȡ��1Ҳ����ȡ��n.

˼·��
1.����һ��int����n�����⸳ֵ
2.Ҫʹ��Random���������裬������������ʹ��
3.���д10����ô����0~9��Ȼ����Ҫ����1~10�����Է�������+1����
4.��ӡ�������
*/
public class Demo78Random {
    public static void main(String[] args) {
        // Random r = new Random();
        // int num = r.nextInt(10) + 1;
        // System.out.println(num);
        for (int i = 0; i < 100; i++) {
            System.out.println(RandomPrint(10));
        }
    }

    public static int RandomPrint(int num) {
        return new Random().nextInt(num) + 1;
    }
}