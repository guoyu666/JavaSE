package Lambda表达式;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 集合的removeIf方法。结合Lambda表达式，删除符合条件的元素
 * 遍历过程中删除符合条件的元素
 * 使用的函数式接口是：判断型（返回boolean类型的方法）
 */
public class LambdaTest19 {
    public static void main(String[] args) {
        // 创建List集合
        List<String> list = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "dd"));

        // 删除cc
        // 匿名内部类的方式
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "cc".equals(s);
            }
        });
        System.out.println(list);

        // Lambda表达式
        list.removeIf(s -> "cc".equals(s));
        System.out.println(list);

        // 使用方法引用进行精简
        list.removeIf("cc"::equals);
        System.out.println(list);
    }
}
