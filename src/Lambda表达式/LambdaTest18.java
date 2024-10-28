package Lambda表达式;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * 使用集合提供的foreach方法，结合Lambda表达式遍历Map集合
 */
public class LambdaTest18 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jack");
        map.put(2, "queen");
        map.put(3, "king");
        map.put(4, "guoyu");

        // 遍历
        // 匿名内部类
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println("key = " + integer + " value = " + s);
            }
        });

        // Lambda改进
        map.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
    }
}
