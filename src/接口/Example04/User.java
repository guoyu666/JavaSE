package 接口.Example04;

/**
 * 1.访问控制权限有哪些？
 *      --private：表示私有的，只能在本类中访问
 *      --protected：只能在本类，同包，子类中访问
 *      --public：表示公开的，在任何位置都可以访问
 *      --默认：表示只能在本类以及同包下进行访问
 * 2.访问控制权限修饰符可以修饰什么？
 *      --属性(4个都能用)
 *      --方法(4个都能用）
 *      --类(public和默认能用, 其他不行)
 *      --接口(public和默认能用，其他不行)
 * 3.Java类库的根类：Object
 *      --这个老祖宗类中的方法我们需要先研究一下，因为这些方法都是所有子类通用的，任何一个类默认继承Object，就算没有 直接继承，最终也会间接继承
 *      --需要掌握的方法：equal(判断两个对象 是否相等)
 *                     clone（负责对象克隆）
 *                     hashcode（获取对象哈希值的一个方法）
 *                     toString（将对象换成字符串的形式）
 *                     finalize（垃圾回收器负责调用的方法）
 *
 */
public class User {
    //私有的
    private int id;

    //受保护的
    protected int age;

    //公开的
    public int weight;

    //默认的
    String name;
}
