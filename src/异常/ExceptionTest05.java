package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
1.处理异常的第一种方式：在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁。抛给调用者来处理

2.第二种方式：使用try catch

3.注意：只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行。另外需要注意，try语句块中的某一行出现异常，该行后面的代码不会执行。
try catch捕捉异常之后，后续代码可以执行
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
        //一般不建议在main方法上使用throws,因为这个异常如果真正的发生了，一定会抛给JVM，JVM只有终止
        //异常处理机制的作用就是增强程序的健壮性，一般main方法中的异常建议使用try catch进行捕捉，main就不要上抛了
        System.out.println("main begin");
        try {
            m1();//try尝试
            //以上代码出现异常，直接进入catch语句块中执行
        } catch (FileNotFoundException e) {     //catch是捕获异常之后的分支
            //这个分支可以使用e引用，e引用保存的内存地址是那个new出来异常对象的地址
            //catch是捕捉异常之后走的分支
            //在catch分支中干什么？处理异常
            System.out.println("文件不存在，可能路径错误，也可能该文件被删除了！！");
            System.out.println(e);
        }
        System.out.println("main over");
    }

    public static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    public static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        //编译器报错的原因是：m3()方法声明位置上有：throws FileNotFoundException
        //我们在这里调用m3()没有对异常进行预处理，所以编译报错

        m3();
        System.out.println("m2 over");
    }

    public static void m3() throws FileNotFoundException {
        //调用SUN jdk中某个类的方法
        //创建一个输入流对象，该流指向一个文件
        /*
        编译报错的原因是什么？
            第一：这里调用了一个构造方法：FileInputStream(String name)
            第二：这个构造方法的声明位置上有：throws FileNotFoundException
            第三：通过类的继承结构看到：FileNotFoundException父类是IOException,IOException的父类是Exception,最终得知，FileNotFoundException是编译时异常

            错误原因？编译时异常要求程序员编写阶段必须对它进行处理，不处理编译器就报错
         */
        // new FileInputStream("/Users/apple/Documents/ideaProjects/JavaSE/src/异常/ExceptionTest08.java");

        //我们采用第一种上抛的处理方式：在方法声明的位置上使用throws继续上抛
        //一个方法体当中的代码出现 异常之后，如果上报的话，此方法结束
        new FileInputStream("/Users/apple/Documents/ideaProjects/JavaSE/src/异常/ExceptionTest08.java");
        System.out.println("如果以上代码出现异常，这里会执行吗？不会的！！");
    }
}
