public class ClassName {
    // 2.继承
    private String name;
    private int age;
    private boolean male;

    // 将构造方法设为 public（如果需要在创建对象时初始化，可以添加）
    public ClassName() {
        System.out.println("无参构造方法执行啦！");
    }

    //封装优化1——this关键字
    // Getter / Setter 全部改为 public
    public String getName() {
        return name;
    }

    //public void setName(String name) {
    //    name = name;
    //}

    //封装优化2——构造方法
    // 全参数的构造方法
    public ClassName(String name, int age) {
        System.out.println("全参构造方法执行啦！");
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        //name = name;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // boolean 类型的 getter 习惯用 isXxx()
    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}