package test2;

public class VarargsTest {
    public static void main(String[] args) {
        float f1 = 10.0F;
        float f2 = 20.0F;
        float f3 = 30.0F;
        float f4 = 40.0F;
        System.out.printf("f1 = %.1f\nf2 = %.1f\nf3 = %.1f\nf4 = %.1f\n\n", 
            f1, f2, f3, f4);
        System.out.printf("Average of f1 and f2 is %.1f\n", average(f1, f2));
        System.out.printf("Average of f1, f2 and f3 is %.1f\n", 
            average(f1, f2, f3));
        System.out.printf("Average of f1, f2, f3 and f4 is %.1f\n", 
            average(f1, f2, f3, f4));

    }

    public static float average(float...numbers) {
        float sum = 0.0F;
        for (float f:numbers) {
            sum += f;
        }
        return sum/numbers.length;
    }
}