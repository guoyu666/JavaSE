package Lambda表达式;

/**
 * Lambda表达式的使用：关于无返回值一个参数的函数式接口
 */
public class LambdaTest04 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        OneParameterNoReturn opnr = new OneParameterNoReturn() {
            @Override
            public void test(Integer value) {
                System.out.println("Integer-->" + value);
            }
        };
        opnr.test(1000);

        // Lambda表达式的方式
        OneParameterNoReturn opnr2 = (Integer value) -> System.out.println("Integer-->" + value);
        opnr2.test(1000);
    }
}

@FunctionalInterface
interface OneParameterNoReturn{
    void test(Integer value);
}
