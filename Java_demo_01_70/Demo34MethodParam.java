/* 
�в�����С���ŵ��������ݣ���һ��������ҪһЩ����������������������ʱ�򣬾����в�����
��������������ӣ�����֪�����������Ǹ��Զ��٣�������� 

�޲�����С���ŵ������ա�һ����������Ҫ�κ������������Լ����ܶ���������񣬾����޲���
���綨��һ����������ӡ�̶�10��HelloWorld
*/
public class Demo34MethodParam {
    public static void main(String[] args) {
        method1(10, 20);
        System.out.println("============");
        method2();

    }

    // ����������ˣ����˷�������֪���������ָ����Ƕ��٣������޷����м���
    // �в���
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("����ǣ�" + result);
    }

    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!" + i);
        }
    }

}