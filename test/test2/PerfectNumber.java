package test2;

public class PerfectNumber {
    public static void main(String[] args) {
        for (int n = 1; n < 10000; n++) {
            if (isPerfect(n)) {
                displayPerfect(n);
            }
        }
    }

    public static boolean isPerfect(int x) {
        int y = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                y += i;
            }
        }
        if (y == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void displayPerfect(int x) {
        System.out.print(x + " = " );
        for (int i =1; i < x; i++) {
            if (x % i == 0) {
                if (i != 1) {
                    System.out.print("+");
                }
                System.out.print(i);
            }
        }
        System.out.println();
    }
}