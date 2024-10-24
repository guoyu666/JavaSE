package 接口.Example04;

/**
 * hashCode方法：
 *      在Object中的hashCode方法是怎样的呢？
 *      public native int hashCode();
 *
 *      这个方法不是抽象方法，带有native关键字，底层调用C++程序
 *
 *      hashCode()方法返回的是哈希码：实际上就是一个java对象的内存地址，经过哈希算法，得出一个值。所以hashCode()方法的执行结果可以等同看做一个Java对象的内存地址
 */
public class hashcode {
    public static void main(String[] args){
        Object o = new Object();
        int hashCodeValue = o.hashCode();

        //对象内存地址经过哈希算法转换成一个数字，可以等同看做内存地址
        System.out.println(hashCodeValue);
    }
}
