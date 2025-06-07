package 类和对象05.Example06;

public class UserTest01 {
    public static void main(String[] args) {
        //创建User对象
        User U = new User();

        /*
             对于当前程序来说，User类的Age属性在外部程序中可以随意访问，导致Age属性的不安全。
            一个User对象表示一个用户，用户的年龄不可能为负数

             封装的好处：
                封装之后对于那个事物来说 ，看不到这个事物的复杂的一面，只能看到该事物简单的一面 。复杂性封装，对外提供简单的操作入口

             对象和引用：
               --对象：目前在使用new运算符在堆内存中开辟的内存空间称为对象
               --引用：是一个变量，不一定是局部变量，还有可能是成员变量。引用保存了内存地址，指向了堆内存当中的对象
         */
        U.setAge(-100);
        U.setAge(89);
        System.out.println(U.getAge());
    }
}
