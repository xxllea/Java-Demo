/*
����һ�������ĸ�ʽ��

public static void �������ƣ��� {
    ������
}

�������Ƶ���������ͱ���һ����ʹ��С�շ塣
�����壺Ҳ���Ǵ����ŵ��п��԰�����������䡣

ע�����
1.����������Ⱥ�˳������ν��
2.�����Ķ��岻�ܲ���Ƕ�װ�����ϵ��
3.����������˺󣬲���ִ�еġ������Ҫִ�У�һ��Ҫ���з����ġ����á���

��ε��÷�������ʽ��

�������ƣ�����
*/
public class Demo14Method {
    public static void main(String[] args) {
        famer(); // ����ũ��ķ���
        seller(); // ����С�̷��ķ���
        cook(); // ���ó��ӵķ���
        me(); // �����ҵķ���
    }

    // ��
    public static void me() {
        System.out.println("��");
    }

    // ����
    public static void cook() {
         System.out.println("ϴ��");
         System.out.println("�в�");
         System.out.println("����");
         System.out.println("װ��");
    }

    // С�̷�
    public static void seller() {
        System.out.println("���䵽ũó�г�");
        System.out.println("̧�߼۸�");
        System.out.println("ߺ��");
        System.out.println("��������");

    }
    // ũ�񲮲�
    public static void famer() {
        System.out.println("����");
        System.out.println("��ˮ");
        System.out.println("ʩ��");
        System.out.println("����");
        System.out.println("�ո�");
        System.out.println("����С�̷�");
    }

}