package 接口.Example04;

/**
 * 关于Object类中的finalize（）方法：
 *      1.在Objets类中的源代码：protected void finalize() throws Throwable {}
 *      2.finalize()方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的
 *      3.这个方法不需要程序员手动调用，JVM的垃圾回收器负责调用这个方法，不像equals和toString需要程序员自己负责调用
 *      4.finalize（）方法的执行 时机：当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize方法
 *      5.finalize（）方法实际上是SUN公司为Java程序员准备的一个时机，垃圾销毁的时机。
 *        如果希望在对象销毁时机执行一段代码，这段代码要写到finalize（）方法中
 *      6.静态代码块的作用是什么？
 *        static {
 *
 *        }
 *        静态代码块的作用是在类加载的时刻执行的，并且只执行一次。这是一个SUN公司准备的类加载时机
 *
 *        finalize（）方法同样也是SUN程序员准备的一个时机，这个时机是垃圾回收时刻
 *      7.提示：java垃圾回收器不是轻易启动的，垃圾太少了，或者时间没到，种种条件下有可能启动，也有可能不启动
 */
public class finalize {
    public static void main(String[] args){
        Person p = new Person();
        p = null;

        //有一段代码可以建议垃圾回收器启动
        System.gc();    //建议启动垃圾回收器（只是建议，可能不启动 ，也可能启动）
    }
}

class Person{
    protected void finalize() throws Throwable{
        System.out.println("即将被销毁！！");
    }
}
