/* 
ʹ�ö�̬��ʼ�������ʱ�����е�Ԫ�ؽ����Զ�ӵ��һ��Ĭ��ֵ���������£�
������������ͣ���ôĬ��Ϊ0��
����Ǹ��������ͣ���ôĬ��Ϊ0.0��
������ַ����ͣ���ôĬ��Ϊ'\u0000' 
����ǲ������ͣ���ôĬ��Ϊfalse;
������������ͣ���ôĬ��Ϊnull.

ע�����
��̬��ʼ����ʵҲ��Ĭ��ֵ�Ĺ��̣�ֻ����ϵͳ�Զ����Ͻ�Ĭ��ֵ�滻��Ϊ�˴����ŵ��еľ�����ֵ��
*/

public class Demo48ArrayUse {
    public static void main(String[] args) {
        // ��̬��ʼ��һ������
        int[] array = new int[3];

        System.out.println(array); // �ڴ��ַ��ϣֵ
        System.out.println(array[0]); // 0 
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
        System.out.println("==================");

        // ������123��ֵ��������array���е�1��Ԫ��
        array[1] = 123;
        System.out.println(array[0]); // 123
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
    }
}