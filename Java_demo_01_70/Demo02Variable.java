public class Demo02Variable {
    public static void main(String[] args) {
        // ����һ������
        // ��ʽ���������� ��������;
        int num1;
        // ������д���һ������
        // ��ʽ���������� = ����ֵ;
        num1 = 10;
        // ����ӡ�����������ʱ����ʾ�������Ǳ���������
        System.out.println(num1);

        // �ı�����е����ݣ�����µ�����
        num1 = 20;
        System.out.println(num1);

        // һ����λ
        int num2 = 50;
        System.out.println(num2);
        // ʹ��һ����λ�ĸ�ʽ���������
        // ��ʽ���������� �������� = ����ֵ��
        num2 = 35;
        System.out.println(num2); // 35
        System.out.println("=============");

        byte num3 = 30; // ע�⣺�Ҳ���ֵ�ķ�Χ���ܳ�������������͵�ȡֵ��Χ
        System.out.println(num3); // 30
        // byte num4 = 400; �Ҳ೬����byte���ݷ�Χ������

        short num5 = 50;
        System.out.println(num5); // 50

        long num6 = 3000000000L;
        System.out.println(num6); // 3000000000

        float num7 = 2.5F;
        System.out.println(num7);

        double num8 = 1.2;
        System.out.println(num8);

        char zifu1 = 'A';
        System.out.println(zifu1);

        boolean var1 = false;
        System.out.println(var1);
        // ��һ���������������ݣ���ֵ������һ������
        // �Ҳ�ı�������var1�Ѿ����ڣ�����װ����false����ֵ
        // ���Ҳ���������falseֵ�����󽻸�var2�������д洢
        boolean var2 = var1;
        System.out.println(var2); // false
    }
}