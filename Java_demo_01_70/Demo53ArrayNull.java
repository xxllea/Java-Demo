/* 
�����������ͱ����������Ը�ֵΪһ��nullֵ�����Ǵ�������ʲô��û��

����������new��ʼ������ʹ�����е�Ԫ�ء�
���ֻ�Ǹ�ֵ��һ��null,û�н���new����
��ô���ᷢ����
��ָ���쳣 NullPointerException

ԭ������new
���������new 
*/
public class Demo53ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        array = new int[3];
        System.out.println(array[0]);
    }
}