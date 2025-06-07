package 类和对象05.Example09;

/**
 * 关于Java语言当中的this关键字：
 *  1.this是一个关键字，翻译为：这个
 *  2.this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身 ，this存储在JVM内存Java对象内部
 *  3.this可以出现在“实例方法”当中，this指向当前正在执行这个动作的对象（this代表当前对象）
 */
public class CustomerTest {
    public static void main(String[] ags) {
        Customer c1 = new Customer();
        c1.name = "郭雨";
        c1.Shopping();

        Customer c2 = new Customer();
        c2.name = "李四";
        c2.Shopping();

        Customer.doSome();

    }

}
