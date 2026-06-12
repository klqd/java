package utils;

public class Demo01_Scanner {
    // 标准构造类
    private String name;
    private int age;

    // 无参构造方法
    public Demo01_Scanner() {}
    // 有参构造方法
    public Demo01_Scanner(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
