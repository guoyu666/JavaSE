package 类和对象05.Example08;

public class Test02 {
    public static void main(String[] args)
    {
        User U = new User(20);
        /*U本身有内存地址，是局部变量，U变量中保存的那个值也非常地特殊，这个值是另一个java对象在堆内存当中的内存地址*/

        add(U);     //传递U给add方法的时候，实际上传递的是U变量中保存的值，只不过这个值是一个Java对象的内存地址
        System.out.println("main-->" + U.age);
    }
    public static void add(User U)
    {
        U.age++;
        System.out.println("add-->" + U.age);
    }
}

class User
{
    //实例变量
    int age;

    //构造方法
    public User(int i)
    {
        age = i;
    }

}
