/*
���ڹ������Ƶķ�����˵����Ϊ�����б�һ����ȴ��Ҫ��ס��ô�಻ͬ�ķ������ƣ�̫�鷳��

���������أ�OverLoad�����������������һ�������ǲ����б�һ��
�ô���ֻ��Ҫ��סΨһһ���������ƣ��Ϳ���ʵ�����ƵĹ���

��������������������أ�
1.����������ͬ
2.�������Ͳ�ͬ
3.�����Ķ�����˳��ͬ

�������������������޹أ�
1.������������޹�
2.�뷽���ķ���ֵ�����޹�
*/
public class Demo40MethodOverLoad {
    public static void main(String[] args) {
       System.out.println(sum(10, 20)); 
       System.out.println(sum(10, 20, 30));
       System.out.println(sum(10, 20, 30, 40));
    }

    public static int sum(int a, int b) {
        return a + b;
    }


    /* ����д�����뷽���ķ���ֵ�޹�
    public static double sum(int a, int b) {
        return a + b + 0.0;
    } */

    /* ����д����������������޹�
    public static int sum(int x, int y) {
        System.out.println("��2�������ķ���ִ�У�");
        return x + y;
    } */

    public static int sum(double a, double b) {
        System.out.println("��2�������ķ���ִ�У�");
        return (int) (a + b);
    }

    public static int sum(int a, double b) {
        System.out.println("��2�������ķ���ִ�У�");
        return (int) (a + b);
    }

    public static int sum(double a, int b) {
        System.out.println("��2�������ķ���ִ�У�");
        return (int) (a + b);
    }

    public static int sum(int a, int b, int c) {
        System.out.println("��3�������ķ���ִ�У�");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("��4�������ķ���ִ�У�");
        return a + b + c + d;
    }
}