
/* 
����Ԫ�صķ�ת��
Ҫ����ʹ�������飬����ԭ����Ψһһ������
*/
public class Demo57ArrayReverse {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 100, 2 };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==================");

        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}