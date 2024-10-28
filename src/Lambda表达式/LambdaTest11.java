package Lambda表达式;

import java.util.function.Function;

/**
 * 静态方法引用
 *      语法格式：
 *          类名::静态方法
 *      条件：
 *          函数式接口中的方法的  返回值类型  和  形参
 *          与
 *          内部调用静态方法的  返回值类型  和  形参
 *          一致
 */
public class LambdaTest11 {
    public static void main(String[] args) {
        // 匿名内部类方式
        // 使用转换型函数式接口
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        System.out.println(function.apply(3.14));

        // Lambda表达式
        Function<Double,Long> function2 = Math::round;
        System.out.println(function2.apply(3.14));
    }
}
