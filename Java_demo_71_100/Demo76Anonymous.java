import java.util.Scanner;

public class Demo76Anonymous {
    
    public static void main(String[] args) {
        // ��ͨʹ�÷�ʽ
        // Scanner sc = new Scanner(System.in); 
        // int num = sc.nextInt();

        // ��������ķ�ʽ
        // int num = new Scanner(System.in).nextInt();
        // System.out.println("������ǣ�" + num);
        
        // ʹ��һ�㷽���������
        // Scanner sc = new Scanner(System.in);
        // methodParam(sc);

        // ʹ���������������д���
        // methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("������ǣ�" + num);
    } 

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("������ǣ�" + num);
    }

    public static Scanner methodReturn() {
        // Scanner sc = new Scanner(System.in);
        // return sc;
        return new Scanner(System.in);
    }
}