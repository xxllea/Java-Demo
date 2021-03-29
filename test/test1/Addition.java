package test1;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.println("请输入第一个数：");
        num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        num2 = sc.nextInt();
        
        sum = num1 + num2;
        System.out.printf("相加后的结果为：%d\n", sum);
    }
}