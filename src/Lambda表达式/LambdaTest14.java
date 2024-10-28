package Lambda表达式;

import java.util.function.Supplier;

/**
 * 构造方法引用
 *      语法格式：
 *          类名::new
 *      条件：
 *          函数式接口中的方法的形式参数列表
 *          与
 *          构造方法上的形式参数列表一致
 *          并且返回值类型相同
 */
public class LambdaTest14 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        // 使用生产型的函数式接口
        Supplier<Bird> supplier = new Supplier<Bird>() {
            @Override
            public Bird get() {
                return new Bird();
            }
        };

        System.out.println(supplier.get());

        // Lambda表达式
        Supplier<Bird> supplier2 = () -> new Bird();
        System.out.println(supplier2.get());

        // 使用构造方法引用进行精简
        Supplier<Bird> supplier3 = Bird::new;
        System.out.println(supplier3.get());
    }
}

class Bird{
    public Bird() {
    }
}
