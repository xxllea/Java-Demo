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

        System.out.println("请输入第一个数：");
        num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        num2 = sc.nextInt();
        System.out.println("请输入第三个数：");
        num3 = sc.nextInt();
        System.out.println("请输入第四个数：");
        num4 = sc.nextInt();
        
        sum = num1 + num2 + num3 + num4;
        System.out.printf("相加后的结果为：%d\n", sum);
        product = num1 * num2 * num3 * num4;
        System.out.printf("相乘后的结果为：%d\n", product);
    }
}