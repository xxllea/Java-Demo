/*
����ѭ��������

1.��������жϴ���û�����������ôforѭ����whileѭ������ִ��0�Σ�����do-whileѭ����ִ������һ��
2.forѭ���ı�����С���ŵ��ж��壬ֻ��ѭ���ڲ��ſ���ʹ�ã�whileѭ����do-whileѭ����ʼ����䱾���������棬���Գ���ѭ��֮�󻹿��Լ���ʹ��

*/
public class Demo27LoopDifference {
    public static void main(String[] args) {
        for (int i = 1; i < 0; i++) {
            System.out.println("Hello");
        }
        // System.out.println(i); // ����д��������i������forѭ��С�����ڣ�ֻ��forѭ���Լ�������
        System.out.println("===========");

        int i = 1;
        do {
            System.out.println("Hello");
            i++;
        } while (i < 0);
        // �����Ѿ�����do-whileѭ���ķ�Χ,������Ȼ����ʹ�ñ���i
        System.out.println(i); // 2
    }
}