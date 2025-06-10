package 类和对象05.OOP10;

/**
 * Singleton:单例
 * 懒汉式单例模式：用到这个对象的时候再创建对象，别在类加载的时候创建对象
 *
 * 第一步：构造方法私有化
 * 第二步：对外提供一个静态方法，通过这个方法可以得到Singleton对象
 * 第三步：提供一个静态变量，但是这个变量值为null
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
