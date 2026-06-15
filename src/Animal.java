public class Animal implements LiveAble {
    // 方式1：
    //@Override
    //public void eat() {
    //    System.out.println("吃东西");
    //}
    //@Override
    //public void sleep() {
    //    System.out.println("晚上睡");
    //}
    // 方式二： 继承LiveAble类方法

    //方式三：覆盖重写默认方法举例：
    @Override
    public void fly() {
        System.out.println("自由自在的飞");
    }
}
