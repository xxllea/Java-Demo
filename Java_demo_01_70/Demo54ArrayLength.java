/* 
��λ�ȡ����ĳ��ȣ���ʽ��
��������.length

���õ�һ��int���֣���������ĳ���

����һ�����������������ڼ䣬���Ȳ��ɸı�
*/

public class Demo54ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10, 20, 30, 3, 4, 5, 6, 89, 56};
        int len = arrayB.length; // 9
        System.out.println("arrayB����ĳ����ǣ�" + len);
        System.out.println("============");

        int[] arrayC = new int[3];
        System.out.println(arrayC);
        System.out.println(arrayC.length); // 3
        arrayC = new int[5];
        System.out.println(arrayC);
        System.out.println(arrayC.length); // 5
    }
}