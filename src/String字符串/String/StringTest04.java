package String字符串.String;

/*
关于String类中的构造方法
 */
public class StringTest04 {
    public static void main(String[] args) {
        //这里只掌握常用的构造方法

        //创建字符串对象最常用的一种方式
        String s1 = "hello world!";
        System.out.println(s1);

        byte[] bytes = {97,98,99};  //97是a,98是b,99是c
        String s2 = new String(bytes);

        //前面说过，输出一个引用的时候，会自动调用toString()方法，默认Object的话，会自动输出对象的内存地址
        //通过输出结果我们得出一个结论：String类已经重写了toString()方法
        //输出字符串对象的话，输出的不是对象的内存地址，而是字符串本身
        System.out.println(s2.toString());  //abc
        System.out.println(s2);
    }
}
