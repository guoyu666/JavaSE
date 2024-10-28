package Lambda表达式;

/**
 * Lambda表达式的使用：关于无返回值多个参数的函数式接口
 */
public class LambdaTest05 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        MoreParameterNoReturn mpnr = new MoreParameterNoReturn() {
            @Override
            public void test(Integer value1, Integer value2) {
                System.out.println(value1 + value2);
            }
        };
        mpnr.test(1,2);

        // Lambda表达式方式
        MoreParameterNoReturn mpnr2 = (Integer value1, Integer value2) -> System.out.println(value1 + value2);
        mpnr2.test(1,2);
    }
}

@FunctionalInterface
interface MoreParameterNoReturn{
    void test(Integer value1, Integer value2);
}
