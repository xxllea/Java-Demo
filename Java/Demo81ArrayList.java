import java.util.ArrayList;

/* 
����ĳ��Ȳ����Է����ı�
����ArrayList���ϵĳ����ǿ�������仯��

����ArrayList��˵����һ��������<E>�����͡�
���ͣ�Ҳ����װ�ڼ��ϵ��е�����Ԫ�أ�ȫ����ͳһ��ʲô���͡�
ע�⣺����ֻ�����������ͣ������ǻ������͡�

ע�����
����ArrayList������˵��ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ���������ݡ�
��������ǿգ��õ����ǿյ������ţ�[]
*/
public class Demo81ArrayList {
    public static void main(String[] args) {
        // ������һ��ArrayList���ϣ����ϵ�������list������װ��ȫ����String�ַ������͵�����
        // ��ע����JDK1.7+��ʼ���Ҳ�ļ������ڲ����Բ�д���ݣ�����<>������Ҫд�ġ�
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list); // []

        // �򼯺ϵ������һЩ���ݣ���Ҫ�õ�add����
        list.add("С��");
        System.out.println(list);

        list.add("С��");
        list.add("С��");
        list.add("С��");
        list.add("С��");
        list.add("С��");
//      list.add(110); // ����д������Ϊ������ʱ������ŷ����Ѿ�˵�����ַ�������ӽ�ȥ��Ԫ�ؾͱ��붼���ַ�������
        System.out.println(list);
    }
}