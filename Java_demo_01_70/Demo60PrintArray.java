import java.util.Arrays;

public class Demo60PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // Ҫ���ʽ��[10, 20, 30, 40, 50]
        // ʹ��������̣�ÿһ������ϸ�ڶ�Ҫ������Ϊ��
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
            System.out.print(array[i] + ", ");
            }
        }

        System.out.println("===========");

        // ʹ���������
        // ��һ��JD�������ṩ�õ�Arrays��
        // ������һ��toString������ֱ�Ӿ��ܰ���������Ҫ�ĸ�ʽ���ַ���
        System.out.println(Arrays.toString(array));
    }
}