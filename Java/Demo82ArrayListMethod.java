import java.util.ArrayList;

/* 
ArrayList���г��õķ����У�

public boolean add(E e)���򼯺ϵ������Ԫ�أ����������ͺͷ���һ�¡�����ֵ��������Ƿ�ɹ���
��ע������ArrayList������˵��add��Ӷ���һ���ǳɹ��ģ����Է���ֵ���ÿɲ��á�
���Ƕ����������ϣ����ѧϰ����˵��add��Ӷ�����һ���ɹ���
public E get(int index)���Ӽ��ϵ��л�ȡԪ�أ�������������ţ�����ֵ���Ƕ�Ӧλ�õ�Ԫ�ء�
public E remove(int index)���Ӽ��ϵ���ɾ��Ԫ�أ�������������ţ�����ֵ���Ǳ�ɾ������Ԫ�ء�
public int size()����ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ��ϵ��а�����Ԫ�ظ�����
*/
public class Demo82ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []
         
        // �򼯺����Ԫ�أ�add
        boolean success = list.add("С��");
        System.out.println(list); // 
        System.out.println("��ӵĶ����Ƿ�ɹ���" + success);

        list.add("С����");
        list.add("С����");
        System.out.println(list); 

        // �Ӽ����л�ȡԪ�أ�get:����ֵ��0��ʼ
        String name = list.get(2);
        System.out.println(name);

        // �Ӽ���ɾ��Ԫ�أ�remove:����ֵ��0��ʼ
        // String whoRemoved = list.remove(1);
        // list.remove(0);
        // System.out.println(whoRemoved);
        System.out.println(list.remove(0));
        System.out.println(list); 

        // ��ȡ���ϳ���,Ҳ��������Ԫ�صĸ���
        // int size = list.size();
        System.out.println(list.size());
    }
}