
public class Demo42OverLoadJudge {
    public static void main(String[] args) {
        public static void open() {} // 1                   ��ȷ����    
        public static void open(int a) {} // 2              ��ȷ����   
        static void open(int a, int b) {} // 3              ������󣻺͵�8�г�ͻ
        public static void open(double a, double b) {} // 4 ��ȷ����  
        public static void open(int a, double b) {} // 5    ������󣺺͵�6�г�ͻ
        public void open(int i, double d) {} // 6           ������󣺺͵�5�г�ͻ
        public static void OPEN() {} // 7                   ������ȷ���ᱨ�����ǲ�������Ч����
        public static void open(int i, int j) {} // 8       ������󣻺͵�3�г�ͻ
    }
}