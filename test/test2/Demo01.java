package test2;

public class Demo01 {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <= 10; count++) {
            if (count == 5) {
                continue;
            }
            System.out.print(count + " ");
        }
        System.out.println("count=" + count);
    }
}