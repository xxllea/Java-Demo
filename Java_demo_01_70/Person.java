/* 
问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来。 
解决方法：用private关键字将需要保护的成员变量进行修饰。

一旦使用private进行修饰，那么本类当中仍然可以随意访问。
但是！超出了本类范围之外就不能直接访问了。

间接访问private成员变量，就是定义一对儿Getter/Setter方法

必须叫setXXX或者是getXXX命名规则。
对于Getter来说，不能有参数，返回值类型和成员变量对应；
对于Setter来说，不能有返回值，参数类型和成员变量对应。
*/

/* 
当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量。
如果需要访问本类当中的成员变量，需要使用格式：
this.成员变量名 (this只能写在方法的内部)
“谁调用方法，谁就是this”
*/
public class Person {
    String name; // 姓名
    private int age; // 年龄

    // 参数name是对方的名字
    // 成员变量name是自己的名字
    public void sayHello(String name) {
        System.out.println(name + ",你好。我是" + this.name);
        System.out.println(this);
    }

    public void show() {
        System.out.println("我叫：" + name + "\n年龄：" + age);
    }

    // 这个成员方法，专门用于向age设置数据
    public void setAge(int num) {
        if (num < 100 && num > 0) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    // 这个成员方法，专门获取age数据
    public int getAge() {
        return age;
    }
}