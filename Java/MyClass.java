
public class MyClass {

    int num; // ��Ա����
    static int numStatic; // ��̬����

    // ��Ա����
    public void method() {
        System.out.println("����һ����Ա������");
        // ��Ա�������Է��ʳ�Ա����
        System.out.println(num);
         // ��Ա�������Է��ʾ�̬����
        System.out.println(numStatic);
    }

    // ��̬����
    public static void methodStatic() {
        System.out.println("����һ����̬������");
        // ��̬�������Է��ʾ�̬����
        System.out.println(numStatic);
        // ��̬����ֱ�ӷ��ʷǾ�̬���ص㡿
//      System.out.println(num); // ����д����

        // ��̬�����в���ʹ��this�ؼ���
//      System.out.println(this); // ����д����
    }
}