/* 
�ָ��ַ����ķ�����
public String[] split(String regex)�����ղ����Ĺ��򣬽��ַ����зֳ�Ϊ���ɲ��֡�

ע�����
split�����Ĳ�����ʵ��һ��������ʽ��
ע�⣺�������Ӣ�ľ�㡰.�������з֣�����д��\\.��(������б��)
*/
public class Demo95StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,d";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("==========");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("==========");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println("==========");
    }
}