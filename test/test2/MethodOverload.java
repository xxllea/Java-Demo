package test2;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println("������7��ƽ��ֵ��" + square(7));
        System.out.println("��������7.5��ƽ��ֵ��" + square(7.5));
    }

    public static int square(int intValue) {
        System.out.println("����int�Ͳ�����square����");
        return intValue * intValue;
    }

    public static double square(double doubleValue) {
        System.out.println("����double�Ͳ�����square����");
        return doubleValue * doubleValue;
    }
}