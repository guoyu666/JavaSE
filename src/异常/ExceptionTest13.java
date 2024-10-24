package 异常;

/*
final,finally,finalize有什么区别？
 */
public class ExceptionTest13 {
    public static void main(String[] args) {
        //final是一个关键字，表示最终的，不变的
        final int i = 100;

        //finally也是一个关键字，和try联合使用，使用在异常处理机制中
        //在finally语句块中的代码是一定会执行的
        try {

        } finally {
            System.out.println("finally");
        }
    }

    //finalize（）是Object类中的一个方法，作为方法名出现，所以finalize是标识符，这个方法是有垃圾回收器GC负责调用的

}
