package Lambda表达式;

/**
 * Lambda表达式的使用：关于有返回值一个参数的函数式接口
 */
public class LambdaTest07 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        OneParameterHasReturn ophr = new OneParameterHasReturn() {
            @Override
            public Integer test(Integer value) {
                return value * 2;
            }
        };
        System.out.println(ophr.test(2));

        // Lambda表达式的方式
        OneParameterHasReturn ophr2 = (Integer value) -> value * 2;
        System.out.println(ophr2.test(2));
    }
}

@FunctionalInterface
interface OneParameterHasReturn{
    Integer test(Integer value);
}
