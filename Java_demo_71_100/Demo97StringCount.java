import java.util.Scanner;

/* 
��Ŀ��
��������һ���ַ���������ͳ�����и����ַ����ֵĴ�����
�����У���д��ĸ��Сд��ĸ�����֡�����

˼·��
1.��Ȼ�õ��������룬�϶���Scanner
2.������������ַ�������ô��String str = sc.next();
3.�����ĸ��������ֱ���������ַ����Եĳ��ִ�����
4.��Ҫ���ַ���һ���֡�һ���ּ�飬String --> char[],��������toCharArray()
5.����char[]�ַ����飬�Ե�ǰ�ַ�����������жϣ��������ĸ���������++������
6.��ӡ����ĸ��������ֱ���������ַ����ִ�����
*/
public class Demo97StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i]; // ��ǰ�����ַ�
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println(countUpper);
        System.out.println(countLower);
        System.out.println(countNumber);
        System.out.println(countOther);


        
        // int num = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     for (int j = 0; j < str.length(); j++) {
        //         char zifu = str.charAt(i);
        //         // char zifu2 = str.charAt(Str.length()-1);
        //         if (j == 0) {
        //             num = 0;
        //         } else if (str.charAt(j) == zifu) {
        //             num++; 
        //         } else if (j == str.length()-1) {
        //             System.out.println(zifu + num);
        //         }
                    
                
                
        //     }
        // }

    }
}