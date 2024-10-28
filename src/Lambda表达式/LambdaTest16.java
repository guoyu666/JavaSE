package Lambda表达式;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;

/**
 * 数组引用
 *      语法格式：
 *          数组::new
 *      条件：
 *          1.函数式接口中的方法只有一个整数型参数
 *          2.这个整数型参数正好是数组的长度
 *          3.返回值类型相同
 */
public class LambdaTest16 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        // 转换型函数式接口
        Function<Integer, int[]> function = new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        };

        int[] nums = function.apply(10);
        System.out.println(Arrays.toString(nums));

        // Lambda表达式
        Function<Integer, int[]> function1 = length -> new int[length];
        int[] nums1 = function1.apply(10);
        System.out.println(Arrays.toString(nums1));

        // 使用数组引用进行精简
        Function<Integer, int[]> function2 = int[]::new;
        int[] nums2 = function2.apply(10);
        System.out.println(Arrays.toString(nums2));
    }
}
