/* 
�����������Ŵ�0��ʼ��һֱ��������ĳ���-1��Ϊֹ

�����������Ԫ�ص�ʱ��������Ų������ڣ���ô���ᷢ��
��������Խ���쳣
ArrayIndexOutOfBrandsException

ԭ���������д���ˡ�
������޸ĳ�Ϊ���ڵ���ȷ������š�
*/
public class Demo52ArrayIndex {
    public static void main(String[] args) {
        int[] array = { 15, 25, 35};

        System.out.println(array[0]); // 15
        System.out.println(array[1]); // 25
        System.out.println(array[2]); // 35
        
        // ����д��
        // ��������3��Ԫ�أ����Է����쳣
        System.out.println(array[3]); 
    }
}