/* 
���������Ϊ�����Ĳ���
�����÷���ʱ���򷽷���С���Ž��д��Σ����ݽ�ȥ����ʵ������ĵ�ֵַ

*/
public class Demo58ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        
        System.out.println(array); //��ֵַ
        
        printArray(array);  //  ���ݽ�ȥ�ľ���array���б���ĵ�ֵַ
        System.out.println("======aaa======");
        printArray(array);
        System.out.println("======bbb======");
        }

    public static void printArray(int[] array) {
        System.out.println("printArray�����յ��Ĳ����ǣ�");
        System.out.println(array); // ��ֵַ
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}