package 继承012.Example05;

/**
 * Java语言当中的final关键字：
 * 1.final是一个关键字，表示 最终的，不可变得
 * 2.final修饰的类无法被继承
 * 3.final修饰的方法无法被覆盖
 * 4.final修饰的变量一旦被赋值后，不可重新赋值
 * 5.实例变量使用final修饰之后，必须手动赋值，不能采用系统默认值
 */
public class FinalTest01 {
    public static void main(String[] args)
    {
        final User user = new User(30);
        user.id = 50;   //final修饰的引用虽然指向某个对象之后不能指向其他对象，但是所指向的对象内部的内存是可以修改的
        System.out.println(Math.PI);
        System.out.println(Chinese.country);
    }

    static class Chinese
    {
        //国籍
        //需求：每一个中国人的国籍都是中国，而且国籍不会发生改变，为了防止国籍被修改 ，建议加final修饰
        //final修饰的实例变量是不可变的，这种变量一般和static联合使用，被称为“常量”
        static final String country = "中国";
    }

    static class Math
    {
        public static final double PI = 3.1415926;
    }
}

