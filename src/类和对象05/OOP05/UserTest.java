package 类和对象05.OOP05;

public class UserTest {
    public static void main(String[] args) {
        // 创建User对象
        User user = new User();

        // 读
        System.out.println(user.age);

        // 改
        user.age = 27;

        // 读
        System.out.println(user.age);

        // 目前User类没有进行封装，在外部程序中可以对User对象的age属性进行随意的访问，这样非常不安全
    }
}
