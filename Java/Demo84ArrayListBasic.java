import java.util.ArrayList;
/* 
���ϣ���򼯺�ArrayList���д洢�����������ݣ�����ʹ�û������Ͷ�Ӧ�ġ���װ�ࡱ

��������    ��װ�ࣨ�������ͣ���װ�඼λ��java.lang���£�
byte        Byte
short       Short
int         Integer     �����⡿
long        Long
float       Float
double      Double
char        Character   �����⡿
boolean     Boolean

��JDK 1.5+��ʼ��֧���Զ�װ�䡢�Զ����䡣

�Զ�װ�䣺�������� --> ��װ����
�Զ����䣺��װ���� --> �������� 
*/
public class Demo84ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        // ����д��������ֻ�����������ͣ������ǻ�������
        // ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        listC.add(300);
        listC.add(400);
        System.out.println(listC);

        int num = listC.get(1);
        System.out.println("��1��Ԫ���ǣ�" + num);

    }
}