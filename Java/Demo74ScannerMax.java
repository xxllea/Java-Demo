import java.util.Scanner;

/* 
��Ŀ��
������������int���֣�Ȼ��������е����ֵ

˼·��
1.��Ȼ�Ǽ������룬�϶���Ҫ�õ�Scanner
2.Scanner�������裺������������ʹ��nextInt()����
3.��Ȼ���������֣���ô��������nextInt()�������õ�����int����
4.�޷�ͬʱ�ж���������˭���Ӧ��ת��Ϊ�������裺
    4.1 �����ж�ǰ��������˭����õ�ǰ���������ֵ
    4.2 ����ǰ�����е����ֵ���ٺ͵��������ֱȽϣ��õ��������ֵ��е����ֵ
5.��ӡ���ս��
*/
public class Demo74ScannerMax {
    public static void main(String[] args) {
        getPrintMax();
   }

   public static void getPrintMax() {
        Scanner sc = new Scanner(System.in); 

        System.out.println("�������һ�����֣�");
        int a = sc.nextInt();

        System.out.println("������ڶ������֣�");
        int b = sc.nextInt();

        System.out.println("��������������֣�");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
      /*  int[] array = { num1, num2, num3};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } 
        }
 */
        System.out.println("���ֵ�ǣ�" + max);
    }
}
