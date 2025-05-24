/*
    方法的递归调用
 */
package 方法04;

public class RecursionTest01 {
    public static void main(String[] args) {
        recursion();
    }
    public static void recursion(){
        System.out.println("recursion begin");
        // 方法的递归调用
        recursion();
        System.out.println("recursion end");
    }
}
