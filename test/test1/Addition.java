package test1;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.println("�������һ������");
        num1 = sc.nextInt();
        System.out.println("������ڶ�������");
        num2 = sc.nextInt();
        
        sum = num1 + num2;
        System.out.printf("��Ӻ�Ľ��Ϊ��%d\n", sum);
    }
}