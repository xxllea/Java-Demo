/*
ֱ�Ӵ�ӡ�������ƣ��õ����������Ӧ�ģ��ڴ��ַ��ϣֵ
��������Ԫ�صĸ�ʽ����������[����ֵ]
����ֵ������һ��int���֣��������鵱��Ԫ�ص�������
��ע�⡿ ����ֵ��0��ʼ��һֱ��������ĳ���-1��Ϊֹ
*/
public class Demo47ArrayUse {
    public static void main(String[] args) {
        int[] array = {10, 20 ,30};
        System.out.println(array); // [I@15db9742

        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30

        // Ҳ���Խ����鵱�е�ĳһ������Ԫ�أ���ֵ��������
        int num = array[1];
        System.out.println(num); // 20
    }
}