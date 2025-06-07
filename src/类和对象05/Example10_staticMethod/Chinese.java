package 类和对象05.Example10_staticMethod;

/**
 * 什么时候成员变量声明为实例变量？--所有对象都有这个属性，但是这个属性的值会随着对象的变化而变化
 * 什么时候成员变量声明为静态变量？--所有对象的属性的值是一样的，建议定义为静态变量，节省内存的开销
 */
public class Chinese {
    String id;

    String name;

    /**
     * 所有中国人的国籍都是中国，这里声明为实例变量是不合适的，太浪费内存空间，没必要每一个对象都保留一份国籍内存
     * 静态变量：静态变量在类加载的时候初始化，不需要创建对象，内存就开辟了，静态变量存储在方法区内存中
     */
    static String country = "中国";

    //默认构造函数
    public Chinese()
    {

    }

    //构造函数
    public Chinese(String id, String name)
    {
        this.id = id;
        this.name = name;

    }
}
