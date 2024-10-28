package Lambda表达式;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda的语法格式：（形式参数列表）-> {方法体}
 */
public class LambdaTest02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300);
        // 对List集合中的元素排序(使用Lambda表达式的方式)
        Collections.sort(list, (o1, o2) -> o1 - o2);
        System.out.println(list);
    }
}
