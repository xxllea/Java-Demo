
public class Demo55Array {
    public static void main(String[] args) {
        int[] array = { 15, 25, 34, 66, 83, 9, 472, 723, 2983};

        // ����ʹ��ԭʼ�İ취
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println("=================");

        for (int i = 0; i <= array.length-1; i++) {
            System.out.println("��["+ (i+1) + "]�� " + array[i]);
        }
    }
}