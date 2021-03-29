/* 
对于基本类型当中的boolean值，Getter方法一定要写成isXXX的形式，而setXXX规则不变。
*/
public class Teacher {

    private String name; // 姓名
    private int age; // 年龄
    private boolean male; // 是不是爷们

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
 }