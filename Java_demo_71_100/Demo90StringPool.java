/* 
�ַ��������أ�������ֱ��д�ϵ�˫�����ַ����������ַ����������С�

���ڻ���������˵��==�ǽ�����ֵ�ıȽϡ�
��������������˵��==�ǽ��С���ֵַ���ıȽϡ�

˫����ֱ��д���ַ����ڳ����ص��У�new�Ĳ��ڳص���
*/
public class Demo90StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false
    }
}