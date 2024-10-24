package 异常;
/*
因为doSome()方法声明位置上使用了：throws ClassNotFoundException，而这个属于编译时异常，必须编写代码时
处理，没有处理编译器会报错
 */
public class ExceptionTest04 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        main方法中调用doSome()方法,因为doSome()方法声明位置有:throws ClassNotFoundException
        我们在调用doSome()方法的时候必须对这种异常进行预先的处理
        如果不处理，编译器就会报错

        第一种处理方式：在方法声明的位置上继续使用：throws，来完成异常的继续上抛，抛给调用者，上抛类似于推卸责任
         */
        doSome();

        //第二种处理方式：try catch进行捕捉，捕捉等于把异常拦下了，异常真正解决了
    }

    /*doSome方法在方法声明的位置使用了：throws ClasNotFoundException
    这个代码表示doSome()方法在执行过程中，有可能会出现ClassNotFoundException异常。
    叫做类找到异常。这个异常直接父类是：Exception,所以ClassNotFound属于编译时异常。
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!");
    }
}
