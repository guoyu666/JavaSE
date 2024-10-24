package 包装类Integer;
/*
好消息：在JDK1.5之后，支持自动拆箱和自动装箱
自动装箱：基本数据类型自动转换成包装类
自动拆箱：包装类自动转换成基本数据类型

有了自动拆箱之后，Number类中的方法就用不到了
 */
public class IntegerTest05 {
    public static void main(String[] args) {
        //自动装箱
        //int类型 - 自动转换为-> Integer
        //x是一个引用，是一个变量，x还是保存了一个对象的内存地址
        Integer x =  100;       //等同于Integer x  = new Integer(1000)

        //分析为什么这个没有报错？
        //加号两边是基本数据类型的数字，z是包装类，不属于基本数据类型，这里会进行自动拆箱，将z转换成基本数据类型
        //在java5之前你这样写肯定会报错
        System.out.println(x + 1);

        //自动拆箱
        //Integer - 自动转换为-> int
        int y = x;

        Integer a = 1000;       //等价于Integer a = new Integer(1000),a是一个引用，保存内存地址指向的对象
        Integer b = 1000;       //同理，b是一个引用，保存内存地址指向的对象
        //比较的是对象的内存地址，a和b两个引用中保存的对象内存地址不同
        System.out.println(a == b);
    }
}
