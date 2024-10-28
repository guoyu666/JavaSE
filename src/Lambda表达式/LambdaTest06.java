package Lambda表达式;

/**
 * Lambda表达式的使用：关于有返回值无参数的函数式接口
 */
public class LambdaTest06 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        NoParameterHasReturn nphr = new NoParameterHasReturn() {
            @Override
            public Integer test() {
                return 300;
            }
        };
        System.out.println(nphr.test());

        // Lambda表达式的方式
        NoParameterHasReturn nphr2 = () -> 300;
        System.out.println(nphr2.test());

    }
}

@FunctionalInterface
interface NoParameterHasReturn {
    Integer test();
}
