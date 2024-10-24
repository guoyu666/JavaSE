package 异常;
/*
1.SUN提供的JDK内置的异常肯定是不够用的，在实际开发中，有很多业务，这些业务出现异常之后，JDK中都是没有的。
2.那么异常类我们可以自己定义吗？
    --可以
3.Java中怎么定义异常呢？
    --两步：第一步：编写一个类继承Exception或者RuntimeException
           第二步：提供两个构造方法，一个无参数的，一个带有String参数的
 */
public class MyException extends Exception{
    public MyException(){

    }
    public MyException(String s){
        super(s);
    }
}
