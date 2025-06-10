package 类和对象05.inherit继承.Example05;

/**
 * final修饰的实例变量一般添加static修饰
 * 结论：1.static final联合修饰的变量称为“常量”
 *      2.常量名建议全部大写，每个单词之间采用下划线衔接
 *      3.实际上常量和静态变量一样，区别在于：常量的值不能修改，静态变量可以修改
 *      4.常量和静态变量都是存储在方法区，并且都是在类加载时初始化
 */
public class FinalTest04 {
    public static void main(String[] args)
    {
        System.out.println(Chinese.COUNTRY);
    }
}

class Chinese
{
    String idCard;
    String name;
    static final String COUNTRY =  "中国";
}
