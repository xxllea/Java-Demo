import java.util.Scanner;

/* 
��Ŀ��������������int���֣����������ֵ��

˼·��
1.��Ȼ��Ҫ�������룬��ô����Scanner
2.Scanner���������裺������������ʹ��
3.��Ҫ�������֣�����Ҫ��������nextInt����
4.�õ����������֣�����Ҫ����һ��
5.�������ӡ�����
*/
public class Demo73ScannerSum {
    public static void main(String[] args) {
        getPrintSum();
    }

    public static void getPrintSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ�����֣�");
        int a = sc.nextInt();
        System.out.println("������ڶ������֣�");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("����ǣ�" + result);
    }
}