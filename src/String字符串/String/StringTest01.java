package String字符串.String;

/*
1.String表示字符串类型，属于引用数据类型，不属于基本数据类型
2.在java中任意使用双引号括起来的都是String对象
3.java中规定，双引号括起来的字符串是不可变的
4.在JDK当中双引号括起来的字符串，都是直接存储在“方法区“的”字符串常量池“当中的
 */
public class StringTest01 {
    public static void main(String[] args) {
        //这两行代码表示底层创建的3个字符对象，都在字符串常量池中
        String s1 = "abcdef";
        String s2 = "abcdef" + "xy";

        //凡是使用双引号括起来的都在字符串常量池中有一份
        //new对象的时候一定在堆内存中开辟空间
        String s3 = new String("xy");


    }
}
