/*  547866
��������ı�׼��ʽ��
������ ������ = new ������();

�����������ֻ���ұߵĶ���û����ߵ����ֺ͸�ֵ���
new ������();

ע�������������ֻ��ʹ��Ψһ��һ�Σ��´����ò��ò��ٴ���һ���¶���
ʹ�ý��飺���ȷ����һ������ֻ��Ҫʹ��Ψһ��һ�Σ��Ϳ�������������
*/
public class Demo75Anonymous {

    public static void main(String[] args) {
        // ��ߵ�one���Ƕ��������
        Person one = new Person();

        one.name = "С��";
        one.showName(); //  �ҽ�С��
        System.out.println("==========");

        // ��������
        new Person().name = "С��";
        new Person().showName(); // null
    }
}