package 方法04;

public class RecursionTest02 {
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println("result = " + result);
    }
    // 使用递归计算1到n的和
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
