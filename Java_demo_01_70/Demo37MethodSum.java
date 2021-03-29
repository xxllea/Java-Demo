
public class Demo37MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum(1, 100));
    }

    public static int getSum(int a , int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }
}