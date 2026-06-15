public interface LiveAble {
    //// 定义抽象方法
    //public abstract void eat();
    //public abstract void sleep();

    // 方式二/三：
    public default void fly(){
        System.out.println("天上飞");
    }
}
