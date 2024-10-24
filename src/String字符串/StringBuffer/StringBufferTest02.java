package String字符串.StringBuffer;
/*
1.String为什么是不可变的？
    --我看过源代码，String类中有一个byte[]数组,这个byte数组采用了final修饰，因为数组一旦创建长度不可变，并且被final修饰的引用一旦指向某个对象之后，不可再指向
    其他对象，所以String是不可变的

2.StringBuffer/StringBuilder为什么是可变的呢？
    --我看过源代码，StringBuffer/StringBuilder内部实际上是一个byte[]数组，这个byte[]数组没有被final修饰，StringBuffer/StringBuilder的 初始化
    容量我记得应该是16，当内存满之后会进行扩容，底层调用了数组拷贝的方法System.arraycopy()。所以StringBuffer/StringBuilder适合于使用字符串的频繁操作
 */
public class StringBufferTest02 {
    public static void main(String[] args) {
        //字符串不可变是什么意思？
        //是说双引号里面的字符串对象一旦创建不可变
        String  s = "abc";
        //s变量是可以指向其他对象的
        //字符串不可变不是说以上变量不可变，说的是“abc"这个对象不可变
        s = "xyz";
    }
}
