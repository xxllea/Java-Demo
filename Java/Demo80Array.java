/*  
��Ŀ��
����һ�����飬�����洢����Girl����

������һ��ȱ�㣺һ�����������������ڼ䳤�Ȳ����Է����ı䡣
*/
public class Demo80Array {
    public static void main(String[] args) {
        // ���ȴ���һ������Ϊ3�����飬�����������Girl���͵Ķ���
        Girl[] array = new Girl[3];

        Girl one = new Girl("С��", 22);
        Girl two = new Girl("С��", 30);
        Girl three = new Girl("С��", 33);

        // ��one���еĵ�ֵַ��ֵ�������0��Ԫ��λ��
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); // ��ֵַ
        System.out.println(array[1]); // ��ֵַ
        System.out.println(array[2]); // ��ֵַ

        System.out.println(array[1].getName());
    }
}