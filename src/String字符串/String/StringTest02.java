package String字符串.String;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        //“hello”是存储在方法区的字符串常量池当中的
        //所以这个“hello”不会新建
        String s2  = "hello";

        System.out.println(s1 == s2);

        String x = new String("xyz");
        String y = new String("xyz");
        //因为这里x和y的地址不一样
        System.out.println(x == y);

        //通过这个案例的学习，我们知道了，字符串对象之间的比较不能使用“==”
        //“==”不保险，应该调用String类的equals方法
        //String类已经重写了equals方法，以下的equals方法调用的是String重写之后的equals方法
        System.out.println(x.equals(y));

    }
}
