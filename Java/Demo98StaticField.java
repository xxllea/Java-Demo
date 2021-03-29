/* 
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
根据类名称访问静态成员变量的时候，全程和对象就没关系，只和类有关系
*/
public class Demo98StaticField {
    public static void main(String[] args) {
        Boy one = new Boy("小明", 22);
        Boy.room = "101教室";
        System.out.println("姓名：" + one.getName()
                 + ",年龄：" + one.getAge() + ",教室：" + one.room
                 + ",学号：" + one.getId());
        Boy two = new Boy("小红", 23);
        System.out.println("姓名：" + two.getName()
                 + ",年龄：" + two.getAge() + ",教室：" + two.room
                 + ",学号：" + two.getId());
    }
}