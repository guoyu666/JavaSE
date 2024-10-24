package String字符串.String;

public class StringTest03 {
    public static void main(String[] args) {
        //分析以下程序：一共创建了几个对象？
        String s1  = new String("hello");
        String s2 = new String("hello");
        //一共创建了3个对象：
        //方法区字符串常量池中有一个：“hello”
        //堆内存中有两个String对象
    }
}
