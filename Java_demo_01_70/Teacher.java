/* 
���ڻ������͵��е�booleanֵ��Getter����һ��Ҫд��isXXX����ʽ����setXXX���򲻱䡣
*/
public class Teacher {

    private String name; // ����
    private int age; // ����
    private boolean male; // �ǲ���ү��

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