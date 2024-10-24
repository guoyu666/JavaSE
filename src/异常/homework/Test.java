package 异常.homework;

public class Test {
    public static void main(String[] args) {
        //创建用户UserService对象
        UserService userService  = new UserService();
        //用户名和密码不再从控制台接受了
        try {
            userService.register("jackson", "123");
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
