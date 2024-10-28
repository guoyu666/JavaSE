package Lambda表达式;

import java.util.function.Consumer;

/**
 * 实例方法引用
 */
public class LambdaTest10 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        // 使用消费者的函数式接口
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Hello");

        // 修改为Lambda表达式
        Consumer<String> consumer1 = System.out::println; // 使用实例方法引用
        consumer1.accept("Hello");
    }
}
