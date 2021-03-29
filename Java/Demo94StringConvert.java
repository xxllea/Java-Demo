/* 
String������ת����صĳ��÷����У�

public char[] toCharArray()������ǰ�ַ������Ϊ��Ϊ�ַ�������Ϊ����ֵ��
public byte[] getBytes()����õ�ǰ�ַ����ײ���ֽ����顣
public String replace(CharSequence oldString, charSequence newString):
�����г��ֵ����ַ����滻��Ϊ�µ��ַ����������滻֮��Ľ�����ַ�����
��ע��CharSequence��˼����˵���Խ����ַ������͡�
*/
public class Demo94StringConvert {
    public static void main(String[] args) {
        // ת����Ϊ�ַ�����
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]); // H
        System.out.println(chars.length); // 5
        System.out.println("==============");

        // ת����Ϊ�ֽ�����
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==================");

        // �ַ����������滻
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1); // How do you do?
        System.out.println(str2); // H*w d* y*u d*?
        System.out.println("===========");

        String lang1 = "�᲻����ѽ�����ү��!���ү��!���ү��!���ү��!"; 
        String lang2 = lang1.replace("���ү��", "****");
        System.out.println(lang2);


    }
}