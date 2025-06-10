package 类和对象05.OOP09;

/**
 * Singleton:单例
 *
 * 单例模式怎么实现？(饿汉式单例模式)
 *      第一步：构造方法私有化
 *      第二步：对外提供一个公开的静态方法，用这个方法获取单个实例
 *      第三步：定义一个静态变量，在类加载的时候，初始化静态变量（只初始化一次）
 *
 * 饿汉式单例模式：类加载时对象就创建好了，不管这个对象用还是不用，提前先把对象创建好
 */
public class Singleton {

    private Singleton() {}

    private static Singleton instance =  new Singleton();

    public static Singleton getInstance() {
       return instance;
    }
}
