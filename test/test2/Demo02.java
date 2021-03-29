package test2;

public class Demo02 {
    public static void main(String[] args) {
        OutterLoop:
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue OutterLoop;
                }
            }
            System.out.print(i + " ");
        }
    }
}