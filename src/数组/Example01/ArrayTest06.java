package 数组.Example01;

public class ArrayTest06 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用该系统时请输入程序参数，参数包括用户名和密码信息，例如：张三 123");
            return;
        } else {
            System.out.println("输入参数成功！！");
        }

        //取出用户名
        String username = args[0];
        //取出密码
        String password = args[1];

        System.out.println(username);
        System.out.println(password);

        //假设用户名是admin,密码是123的时候表示登陆成功，其他一律失效
        //判断两个字符串是否相等用equals
        if (username.equals("admin") && password.equals("123")) {
            System.out.println("登陆成功！，欢迎" + username + "回来！");
        } else {
            System.out.println("验证失败！！");
        }

    }
}
