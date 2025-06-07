package 类和对象05.OOP06;

/**
 * 为了保证User类型对象的age属性的安全，我们需要使用封装机制，实现封装的步骤是什么？
 *      1.第一步：属性私有化（什么是私有化？使用private进行修饰）
 *        属性私有化的作用是：禁止外部程序对该属性进行随意访问；所有private修饰的，都是私有的，私有的只能在本类中进行访问
 *      2.第二步：为了保证外部的程序仍然可以访问age属性，因此要对外提供公开的访问入口
 *        访问一般包括两种：
 *              读：读取属性的值；
 *              写：修改属性的值；
 */
public class User {

    private int age;

    // 读
    public int getAge() {
        return age;
    }

    // 构造方法
    public User(int age) {
        this.age = age;
    }

    public User() {
    }

    // 写
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("年龄不合法！！");
            return;
        }
        // this.大部分情况下可以省略
        // this.什么时候不能省略？用来区分局部变量和成员变量的时候
        this.age = age;
    }
}
