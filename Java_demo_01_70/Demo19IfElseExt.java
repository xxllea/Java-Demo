// x��y�Ĺ�ϵ�������£�
// ���x >= 3,��ôy = 2x + 1;
// ���-1 < x < 3,��ôy = 2x;
// ���x <= -1,��ôy = 2x - 1;
public class Demo19IfElseExt {
    public static void main(String[] args) {
        int x = 7;
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x > -1 && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println(y);
    }
}