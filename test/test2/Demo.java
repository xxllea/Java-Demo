package test2;

public class Demo {
    public static void main(String[] args) {
        int iVal = 258;
        long lVal = 1000;
        short sVal = 12;
        byte bVal = 2;
        char cVal = 'a';
        float fVal = 5.67f;
        double dVal = .1234;
        lVal = iVal;
        dVal = fVal;
        bVal = (byte) iVal;
        iVal = (int) lVal;
       
        iVal = cVal + 1;
        System.out.println("iVal£º" + getType(iVal));
    
        lVal = (long) fVal;
        System.out.println("lVal£º" + getType(lVal));
        
        bVal = (byte) (bVal * 2);
        System.out.println("bVal£º" + getType(bVal));
    }

    public static String getType(Object o) {
        return o.getClass().toString();
    }
   
}