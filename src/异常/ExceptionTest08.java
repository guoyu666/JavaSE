package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
1.异常对象的两个方法：
    String msg = e.getMessage();
    e.printStackTrace();

2.我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序呢？
    --异常信息追踪信息，从上往下一行一行看
    --但是需要注意的是：SUN写的代码（看包的名字）就不用看了，主要的问题是出现在自己编写的代码上
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            String msg = e.getMessage();
            System.out.println(msg);
            //打印异常堆栈追踪信息
            //在实际的开发中，建议使用这个
            e.printStackTrace();
        }
        System.out.println("这里程序不耽误执行！");
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        m3();
    }

    public static void m3() throws FileNotFoundException {
        new FileInputStream("/Use/apple/Documents/ideaProjects/JavaSE/src/异常/ExceptionTest01.java");
    }
}
