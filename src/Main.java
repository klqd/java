import utils.Demo01_Scanner;
import java.util.Arrays;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
            // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
            System.out.println("i = " + i);
        }
        //第一节课题
        // 1、常量
        // 整数常量	所有的整数	0，1， 243， -7
        // 小数常量	所有的小数	0.0， -0.2， 3.95
        // 字符常量	单引号引起来,只能写一个字符,必须有内容	‘a’， ‘好’
        // 字符串常量	双引号引起来,可以写多个字符,也可以不写	“A” ，“Hello” ，“你好” ，""
        // 布尔常量	只有两个值	true ， false
        // 空常量空常量	只有一个值	null

        //输出整数常量
        System.out.println(249);
        //输出小数常量
        System.out.println(0.13);
        //输出字符常量
        System.out.println('A');
        //输出布尔常量
        System.out.println(true);
        //输出字符串常量
        System.out.println("你好呀Java");

        // 2、数据类型
        //数据类型	关键字	内存占用	   取值范围
        //字节型	    byte	 1个字节	    -128~127
        //短整型	    short	 2个字节	    -32768~32767
        //整型	    int（默认） 4个字节	-2的31次方~2的31次方-1
        //长整型	    long	    8个字节	-2的63次方~2的63次方-1
        //单精度浮点数  float	4个字节	     1.4013E-45~3.4028E+38
        //双精度浮点数  double（默认）	8个字节	4.9E-324~1.7977E+308
        //字符型	     char	     2个字节	   0-65535
        //布尔类型	boolean	   1个字节	    true，false

        // 数据类型转换
        int i1 = 1;
        byte b1 = 2;
        //byte x = b1 + i1; // 报错
        //int类型和byte类型运算，结果是int类型
        int j = b1 + i1;
        System.out.println(j);

        // 同样道理，当一个 int 类型变量和一个 double 变量运算时， int 类型将会自动提升为 double 类型进行运算。
        int i2 = 1;
        double d2 = 2.5;
        //int类型和double类型运算，结果是double类型
        //int类型会提升为double类型
        double e = d2 + i2;
        System.out.println(e);

        //转换规则
        //范围小的类型向范围大的类型提升，如 byte 、short、char 运算时直接提升为 int

        //byte、short、char‐‐>int‐‐>long‐‐>float‐‐>double

        byte b3 = 1;
        byte b4 = 2;
        //1和2是常量，为固定不变的数据，在编译的时候，已经确定了1+2的结果并没有超过byte类型的取值范围
        //所以1+2可以赋值给变量b3
        byte b5 = 1 + 2;  //因此 b3=1 + 2是正确的。
        System.out.println(b5);
        //b2和b3是变量，变量的值是可能变化的，在编译的时候，编译器javac不确定b2+b3的结果是什么
        //因此会将结果以int类型进行处理，所以int类型不能赋值给byte类型，
        //byte b6 = b3 + b4;  //因此编译失败。
        //System.out.println(b3);
        //System.out.println(b4);


        //int i = 1.5; // 错误
        //double 类型内存8个字节， int 类型内存4个字节。 1.5 是 double 类型，取值范围大于 int 。
        //想要赋值成功，只有通过强制类型转换，将 double 类型强制转换成 int 类型才能赋值。

        //强制类型转换 ：将 取值范围大的类型 强制转换成 取值范围小的类型 。
        //比较而言，自动转换是Java自动执行的，而强制转换需要我们自己手动执行。

        //强制类型转换格式： 数据类型 变量名 = （数据类型）被转数据值；

        // double类型数据强制转成int类型，直接去掉小数点。
        int ii = (int)1.1;


        //short类型变量，内存中2个字节
        short s = 1;
     /*
       出现编译失败
       s和1做运算的时候，1是int类型，s会被提升为int类型
       s+1后的结果是int类型，将结果在赋值会short类型时发生错误
       short内存2个字节，int类型4个字节
       必须将int强制转成short才能完成赋值
     */
        //s = s + 1;//编译失败
        s = (short)(s+1);//编译成功
        System.out.println(s);


        // 3、变量
        //数据类型 变量名 = 数据值;
        byte b = 100;
        System.out.println(b);

        short s8 = 100;
        System.out.println(s8);

        int i = 10033;
        System.out.println(i);

        long l = 1003L;
        System.out.println(l);

        float f = 100.1F;
        System.out.println(f);

        double d = 100.1;
        System.out.println(d);

        boolean bool = true;
        System.out.println(bool);

        char c = 'A';
        System.out.println(c);

        char c1 = 'A';
        System.out.println(c1);


        //4、三元运算符
        //三元运算符格式：
        //数据类型 变量名 = 布尔类型表达式？结果1：结果2

        //三元运算符计算方式：
        //布尔类型表达式结果是 true，三元运算符整体结果为结果1，赋值给变量。
        //布尔类型表达式结果是false，三元运算符整体结果为结果2，赋值给变量。

        int init = (1 == 2 ? 100 : 200);
        System.out.println(init);//200
        int j2 = (3 <= 4 ? 500 : 600);
        System.out.println(j2);//500

        // 定义s为short范围内最大值
        short shortfall = 32767;
        // 运算后，强制转换，砍掉2个字节后会出现不确定的结果
        shortfall = (short)(shortfall + 10);
        System.out.println(shortfall);

        //5、方法
        //定义格式：
        //修饰符 返回值类型 方法名 （参数列表）｛
        //    代码...
        //    return 方法的返回值;
        // ｝


        //定义格式解释：
        //
        //修饰符： 目前固定写法 public static
        //返回值类型： 表示方法运行的结果的数据类型，方法执行后将结果返回到调用者
        //方法名：为我们定义的方法起名，满足标识符的规范，用来调用方法
        //参数列表： 方法在运算过程中的未知数据，调用者调用方法时传递
        //return：将方法执行后的结果带给调用者，方法执行到 return ，整体方法运行结束。如果返回值类型是void，方法大括号内的return可以不写
        FirstProgram.methodName();
        FirstProgram.printHelloWorld(10);

        //for (int p = 1; p <= 10; i++) {
        //    //需求:不打印第三次HelloWorld
        //    if(i == 3){
        //        continue;
        //    }
        //    System.out.println("HelloWorld"+p);
        //}

        // 6、数组
        //定义方式一
        //格式：
        //数组存储的数据类型[]   数组名字 = new   数组存储的数据类型[长度];
        int[] arr = new int[3]; //定义可以存储3个整数的数组容器

        //定义方式二
        //格式：
        //数据类型[]   数组名 = new   数据类型[]{元素1,元素2,元素3…};
        int[] arr1 = new int[]{1,2,3,4,5}; //定义存储1，2，3，4，5整数的数组容器

        //定义方式三
        //格式：
        //数据类型[]   数组名 =   {元素1,元素2,元素3…};
        int[] arr3 = {1,2,3,4,5}; //定义存储1，2，3，4，5整数的数组容器


        // 数组访问
        // 数组名[索引]
        //定义存储int类型数组，赋值元素1，2，3，4，5
        int[] arr4 = {1,2,3,4,5};
        //为0索引元素赋值为6
        arr4[0] = 6;
        //获取数组0索引上的元素
        int i5 = arr4[0];
        System.out.println(i5);
        //直接输出数组0索引元素
        System.out.println(arr4[0]);
        System.out.println(Arrays.toString(arr4));



        int[] arrList = new int[3];
        int[] arrList2 = new int[2];
        System.out.println(Arrays.toString(arrList));
        System.out.println(Arrays.toString(arrList2));


        int[] arr5 = { 1, 2, 3, 4, 5 };
        for (int i9 = 0; i9 < arr5.length; i9++) {
            System.out.println(arr5[i9]);
        }


        //数组获取最大值元素
        int[] arrList3 = { 5, 15, 2000, 10000, 100, 4000 };
        //定义变量，保存数组中0索引的元素
        int max = arrList3[0];
        //遍历数组，取出每个元素
        for (int t = 0; t < arrList3.length; t++) {
            //遍历到的元素和变量max比较
            //如果数组元素大于max
            if (arrList3[t] > max) {
                //max记录住大值
                max = arrList3[t];
            }
        }
        System.out.println("数组最大值是： " + max);


        //对象的使用格式举例:

        //对象的使用格式
        //通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。
        //  ①导包：也就是指出需要使用的类在什么位置
        //        格式：import 包名称.类名称；
        //        举例：import cn.itcast.day03.demo01.Student;
        //        注：对于和当前属于同一个包的情况，可以省略导包语句
        //  ②创建：
        //        格式：类名称 对象名 = new 类名称();
        //        举例：Student stu = new Student();
        //  ③使用：
        //        使用成员变量：对象名.成员变量名;
        //        使用成员方法：对象名.成员方法名(参数);

        //创建对象格式：类名 对象名 = new 类名();
        Student objStudent = new Student();
        //直接输出成员变量值
        System.out.println("姓名："+objStudent.name); //null
        System.out.println("年龄："+objStudent.age);

        //给成员变量赋值
        objStudent.name = "张学霸";
        objStudent.age = 18;
        //再次输出成员变量的值
        System.out.println("姓名："+objStudent.name); //张学霸
        System.out.println("年龄："+objStudent.age); //18
        //调用成员方法
        objStudent.study();
        objStudent.eat();


        // 给继承数据赋值
        ClassName obj = new ClassName();
        obj.setName("林凡");
        obj.setAge(18);
        obj.setMale(true);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.isMale());

        // 无构造参数
        ClassName obj2 = new ClassName();
        // 全参构造，无需使用setXxx方法
        ClassName obj3 = new ClassName("消炎", 20);
        System.out.println("姓名：" + obj3.getName() + "，年龄：" + obj3.getAge());
        // 如果需要改变对象当中的成员变量数据内容，仍然还需要使用setXxx方法
        obj3.setAge(21); // 改变年龄
        System.out.println("姓名：" + obj3.getName() + "，年龄：" + obj3.getAge());


        // 标准代码——JavaBean
        // 无参构造方法使用: 需要先添加后获取
        Demo01_Scanner scannerNull = new Demo01_Scanner();
        scannerNull.setName("陈凡");
        scannerNull.setAge(21);
        System.out.println("姓名：" + scannerNull.getName() + "年龄：" + scannerNull.getAge());

        // 有参构造方法使用：可以直接传参新增数据内容
        Demo01_Scanner scanner = new Demo01_Scanner("陈凡", 19);
        System.out.println("姓名：" + scanner.getName() + "年龄：" + scanner.getAge());

    }
}