
public class Demo42OverLoadJudge {
    public static void main(String[] args) {
        public static void open() {} // 1                   正确重载    
        public static void open(int a) {} // 2              正确重载   
        static void open(int a, int b) {} // 3              代码错误；和第8行冲突
        public static void open(double a, double b) {} // 4 正确重载  
        public static void open(int a, double b) {} // 5    代码错误：和第6行冲突
        public void open(int i, double d) {} // 6           代码错误：和第5行冲突
        public static void OPEN() {} // 7                   代码正确不会报错，但是并不是有效重载
        public static void open(int i, int j) {} // 8       代码错误；和第3行冲突
    }
}