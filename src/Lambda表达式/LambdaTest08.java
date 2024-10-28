package Lambda表达式;

/**
 * Lambda表达式的使用：关于有返回值多个参数的函数式接口
 */
public class LambdaTest08 {
    public static void main(String[] args) {
        // 匿名内部类方式
        MoreParameterHasReturn mphr = new MoreParameterHasReturn() {
            @Override
            public Integer test(Integer value1, Integer value2) {
                return value1 + value2;
            }
        };
        System.out.println(mphr.test(1, 2));

        // Lambda表达式的方式
        MoreParameterHasReturn mphr2 = (Integer value1, Integer value2) -> value1 + value2;
        System.out.println(mphr2.test(1, 2));
    }
}

@FunctionalInterface
interface MoreParameterHasReturn{
    Integer test(Integer value1, Integer value2);
}
