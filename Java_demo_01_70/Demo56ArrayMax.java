
public class Demo56ArrayMax {
    public static void main(String[] args) {
        int[] array = { 5, 14, 23, 46, -20, 34, 45, 47, 99};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } 
        }
        System.out.println("max:" + max);
    }
}