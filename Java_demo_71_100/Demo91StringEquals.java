/* 
==�ǽ��ж���ĵ�ֵַ�Ƚϣ����ȷʵ��Ҫ�ַ��������ݱȽϣ�����ʹ������������

public boolean equals(Object obj); �����������κζ���ֻ�в�����һ���ַ�������������ͬ�ĲŻ��true;���򷵻�false;
ע�����
1.�κζ�������Object���н��ա�
2.equals�������жԳ��ԣ�Ҳ����a.equals(b)��b.equals(a)Ч��һ����
3.����Ƚ�˫��һ������һ���������Ƽ��ѳ����ַ���д��ǰ�档
�Ƽ�: "abc".equals(str)     ���Ƽ�: str.equals("abc") strΪnull�ᱨ��

public boolean equalsIgnoreCase(String str)�����Դ�Сд���������ݱȽ�
*/
public class Demo91StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};    
        String str3 = new String(charArray);
        
        System.out.println(str1.equals(str2)); // true  
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals("Hello")); // true
        System.out.println("Hello".equals(str1)); // true

        String str4 = "hello";
        System.out.println(str1.equals(str4)); // false
        System.out.println("================");

        String str5 = null;
        System.out.println("abc".equals(str5)); // �Ƽ���false
//      System.out.println(str5.equals("abc")); // ���Ƽ���������ָ���쳣NullPointerException
        System.out.println("==================");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB)); // false,�ϸ����ִ�Сд
        System.out.println(strA.equalsIgnoreCase(strB)); // true,���Դ�Сд

        // ע�⣺ֻ��Ӣ����ĸ���ִ�Сд�������������ִ�Сд
        System.out.println("abcһ123".equalsIgnoreCase("abcҼ123")); // false

    }
}