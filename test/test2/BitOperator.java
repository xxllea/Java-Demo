package test2;

public class BitOperator {
    public static void main(String[] args) {
        byte a = 025, b = 4;
        System.out.println("~" + a + "=" + (~a));
        System.out.println(a + "&" + b + "=" + (a&b));
        System.out.println(a + "|" + 6 + "=" + (a|b));
        System.out.println(a + "^" + b + "=" + (a^b));
        a = 59;
        System.out.println(a + "<<" + 2 + "=" + (a<<2)); 
        System.out.println(a + ">>" + 2 + "=" + (a>>1)); 
        a = -77;
        System.out.println(a + "<<" + 1 + "=" + (byte)(a<<1));
        System.out.println(a + ">>>" + 1 + "=" + (byte)(a>>>1));
    }
}