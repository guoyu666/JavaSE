package Lambda表达式;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 使用集合提供的foreach方法，结合Lambda表达式遍历List集合
 */
public class LambdaTest17 {
    public static void main(String[] args) {
        // List集合
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // 遍历List集合，调用foreach方法
        // foreach方法的参数是一个函数式接口：Consumer(消费型接口)
        // 匿名内部类方式
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer elt) {
                // elt代表的就是集合中的每个元素
                System.out.println(elt);
            }
        });
        System.out.println("=======================");
        // Lambda表达式改进
        list.forEach(elt -> System.out.println(elt));
        System.out.println("=======================");
        // 使用方法引用进行精简
        list.forEach(System.out::println);
    }
}
