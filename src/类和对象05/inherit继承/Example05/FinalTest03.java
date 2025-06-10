package 类和对象05.inherit继承.Example05;

/**
 * 1.final修饰的实例变量只能赋值一次
 * 2.实例变量在什么时候赋值？--构造方法执行的时候进行赋值
 */
public class FinalTest03 {
    public static void main(String[] aargs)
    {

    }
}

class People
{
    //final int age;  final修饰的实例变量，系统不能直接赋默认值0，要求程序员必须手动赋值（方法1）

    final double weight;    //另一种方法是可以先不用赋值，通过在构造函数里面进行赋值（方法2）

    //默认构造函数
    public People()
    {
        this.weight = 50;
    }
}
