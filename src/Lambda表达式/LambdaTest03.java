package Lambda表达式;

/**
 * Lambda表达式的使用：关于无返回值无参数的函数式接口
 */
public class LambdaTest03 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        NoParameterNoReturn npnr = new NoParameterNoReturn() {
            @Override
            public void test() {
                System.out.println("test");
            }
        };
        npnr.test();

        // 改成Lambda表达式
        NoParameterNoReturn npnr2 = () -> System.out.println("test2");
        npnr2.test();
    }
}

@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}
