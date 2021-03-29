
public class Demo70Dog {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // 无参构造
        System.out.println("==========");
        Dog dog2 = new Dog("小白", 5); // 全参构造
        System.out.println("姓名：" + dog2.getName() + ",年龄：" + dog2.getAge());
        // 如果需要改变对象当中的成员变量数据内容，仍然还需要使用setXXX方法
        dog2.setAge(6);
        System.out.println("姓名：" + dog2.getName() + ",年龄：" + dog2.getAge());

    }
}