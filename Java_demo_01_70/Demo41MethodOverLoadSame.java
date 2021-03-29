/* 
��ĿҪ��
�Ƚ���������ȡ�
�������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long����
����main�����н��в��ԡ�
*/
public class Demo41MethodOverLoadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        System.out.println(isSame((short) a, (short) b));
        System.out.println(isSame(11, 12));
        System.out.println(isSame(10L, 12L));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("����byte�����ķ���ִ�У�");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("����short�����ķ���ִ�У�");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("����int�����ķ���ִ�У�");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("����long�����ķ���ִ�У�");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}