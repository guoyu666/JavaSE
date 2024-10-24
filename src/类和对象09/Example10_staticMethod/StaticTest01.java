package 类和对象09.Example10_staticMethod;

/**
 * 可以使用static关键字来定义“静态代码块”：
 * 1.语法模式：
 *  static
 *  {
 *    java语句；
 *  }
 *
 *  2.静态代码块在类加载时执行，并且只执行一次
 *
 *  3.静态代码块在一个类中可以编写多个，并且遵循自上而下的顺序执行
 *
 *  4.通常在 静态代码块中完成预备工作，先完成数据的准备工作，例如：初始化连接池...
 */

public class StaticTest01 {
    static{
        System.out.println("类加载-->1");
    }

    static {
        System.out.println("类加载-->2");
    }

    public static void main(String[] args)
    {
        System.out.println("Main begin!!");
    }
}
