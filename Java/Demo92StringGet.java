/* 
String�������ȡ��صĳ��÷����У�

public int length():��ȡ�ַ������к��е��ַ��������õ��ַ�������
public String concat():����ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ���µ��ַ�����
public char charAt(int index):��ȡָ������λ�õĵ����ַ�����������0��ʼ��
public int indexOf(String str):���Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ
*/
public class Demo92StringGet {
    public static void main(String[] args) {
        // ��ȡ�ַ����ĳ���
        int length = "sdfhsiahgiagha".length();
        System.out.println("�ַ������ȣ�" + length);

        // ƴ���ַ���
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("============");

        // ��ȡָ������λ�õĵ����ַ�
        char ch = "Hello".charAt(1);
        System.out.println("��1������λ�õ��ַ��ǣ�" + ch);

        // ���Ҳ����ַ����ڱ����ַ������г��ֵĵ�һ������λ��
        // �������û�У�����-1ֵ
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("��һ������ֵ�ǣ�" + index);

        System.out.println("HelloWorld".indexOf("abc")); // -1
    }
}