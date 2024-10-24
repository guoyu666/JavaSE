package 类和对象09.Example06;

/*
    封装的步骤：
        1.所有属性进行私有化，使用private关键字进行修饰private表示私有的，修饰的所有数据只能在本类中进行访问
        2.对外提供简单的操作入口，也就是说外部程序想要访问age属性，必须通过这些简单的入口进行访问：
            --对外提供两个公开的方法，分别是set和get方法
 */
public class User {

    //属性私有化
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int n) {
        if (n < 0 || n > 150) {
            System.out.println("不合法！！");
        } else
            age = n;
    }
}
