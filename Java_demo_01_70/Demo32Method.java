
public class Demo32Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        System.out.println("¾Å¾Å³Ë·¨±í£º");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d\t", i, j, i*j);
            }
            System.out.println();
        }
    }
}