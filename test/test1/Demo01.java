package test1;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int sum;
        int product;

        System.out.println("�������һ������");
        num1 = sc.nextInt();
        System.out.println("������ڶ�������");
        num2 = sc.nextInt();
        System.out.println("���������������");
        num3 = sc.nextInt();
        System.out.println("��������ĸ�����");
        num4 = sc.nextInt();
        
        sum = num1 + num2 + num3 + num4;
        System.out.printf("��Ӻ�Ľ��Ϊ��%d\n", sum);
        product = num1 * num2 * num3 * num4;
        System.out.printf("��˺�Ľ��Ϊ��%d\n", product);
    }
}