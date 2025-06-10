package 类和对象05.inherit继承.Example07;

/**
 * 访问权限修饰符 ：
 * 1.访问控制权修饰符来控制元素的范围
 * 2.访问控制权修饰符包括：
 *      public      表示公开的，在任何位置都可以访问
 *      protected   同包，子类可以访问
 *      缺省         同包可以访问
 *      private     表示私有的，只能在本类中访问
 * 3.当某个数据只希望子类使用时，使用protected进行修饰
 * 4.修饰符的范围：
 *      private<缺省<protected<public
 */
public class Test {
    public static void main(String[] args)
    {
        User user = new User();
        System.out.println(user.i);
        System.out.println(user.j);
    }
}
