package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
深入理解try catch

1.catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型
2.catch可以写多个，建议catch的时候，精确的一个一个处理，这样有利于程序的调试
3.catch写多个的时候，从上到下，必须遵守从小到大
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("/Use/apple/Documents/ideaProjects/JavaSE/src/异常/ExceptionTest01.java");
            //进行数学运算
            System.out.println(100 / 0);    //这个异常是运行时异常，编写程序时可以处理，也可以不处理
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println("读取文件异常？数序异常？空指针异常？");
        }
    }
}
