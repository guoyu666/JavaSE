package 异常;

import java.awt.desktop.UserSessionEvent;

/*
什么是异常？java提供了异常处理机制有什么用？
1.以下程序执行过程中发生了不正常的情况，而这种不正常的情况叫做：异常。Java语言是很完善的语言，提供了异常的处理方式，以下程序执行过程中出现了
不正常的情况，java把该异常信息打印到控制台，供程序员参考。

2.出现的错误信息我们称为：异常信息。这个信息是JVM打印的

3.异常的作用：增强程序的健壮性
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        /*
        int a = 10;
        int b = 0;
        int c = a / b;      实际上JVM执行到此的时候，会new异常对象：new ArithmeticException("/ by zero")，并且JVM将new对象抛出，打印信息到控制台
        System.out.println(c);
         */
    }

}
