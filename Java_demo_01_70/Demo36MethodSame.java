/* 
��ĿҪ��
����һ�������������ж����������Ƿ���ͬ��
*/
public class Demo36MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(3, 6));
    }

    /* 
    ��Ҫ�أ�
    ����ֵ���ͣ�boolean
    �������ƣ�isSame
    �����б�
    */
    public static boolean isSame(int a, int b) {
        if (a == b) {
            return true;
        } 
        return false;
    } 
}