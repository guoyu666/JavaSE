package 类和对象05.OOP06;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();

        // 读
        System.out.println("初始的年龄" + user.getAge());

        // 写
        user.setAge(27);

        System.out.println("修改后的年龄" + user.getAge());
    }
}
