/* 
�ַ����Ľ�ȡ������

public String substring(int index)����ȡ�Ӳ���λ��һֱ���ַ���ĩβ���������ַ�����
public String substring(int begin, int end)����ȡ��begin��ʼ��һֱ��end�������м���ַ�����
��ע��[begin, end)��������ߣ��������ұߡ�
*/
public class Demo93Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);  // HelloWorld
        System.out.println(str2);  // World,���ַ���
        System.out.println("===========");

        String str3 = str1.substring(4, 7);
        System.out.println(str3); // oWo
        System.out.println("===========");

        // ��������д�����ַ�����������Ȼ��û�иı��
        // �����������ַ���:"Hello","Java"
        // strA���б�����ǵ�ֵַ
        // ������ֵַ��Hello��0x666
        // ������ֵַ�����Java��0x999
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "Java";
        System.out.println(strA); // Java
    }
}