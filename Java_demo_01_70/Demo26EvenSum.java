// 求1-100的偶数和
public class Demo26EvenSum {
    // public static void main(String[] args) {
    //     int result = 0;
    //     for (int i = 1; i <= 100; i++) {
    //         if (i % 2 == 0) {
    //             result += i;
    //         }
    //     }
    //     System.out.println(result);
// }
    // public static void main(String[] args) {
    //     int result = 0;
    //     int i = 1;
    //     while (i <= 100) {
    //         if (i % 2 == 0) {
    //             result += i;
    //         }
    //     i++;
    //     }
    //     System.out.println(result);
    // }
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                result += i;
            }
            i++;
        } while (i <= 100);
        System.out.println(result);
    }
}