package test2;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Final Value:" + factorial(5));
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n *factorial(n-1);
        }
    }
}