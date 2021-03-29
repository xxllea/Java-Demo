package test3;

public class accessModifier {
    private int a;
    int b;
    protected double c;
    public char d;
    public void setA(int a1) {
        a = a1;
    }
}

class accessModifierTest {
    public static void main(String[] args) {
        accessModifier obj = new accessModifier();
        obj.setA(1);
        obj.b = 2;
        obj.c = 1.5;
        obj.d = '#';
    }
}

