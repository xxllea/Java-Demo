package test2;

public class YangHui {
    public static void main(String[] args) {
        int yanghui[][] = {{1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1}};
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print("\t" + yanghui[i][j]);
            }
        System.out.println();
        }
    }
}