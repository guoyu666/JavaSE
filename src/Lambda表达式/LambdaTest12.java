package Lambda表达式;

import java.util.Comparator;

/**
 * 特殊方法引用
 *      语法格式：
 *          类名::实例方法
 *      条件：
 *          1.函数式接口中抽象方法的第一个参数作为内部方法调用对象
 *          2.从函数式接口的抽象方法的第二个参数开始 与 内部调用方法时的参数类型 一致
 *          3.函数式接口中的抽象方法返回值类型 与 内部方法返回值类型 一致
 */
public class LambdaTest12 {
    public static void main(String[] args) {
        // 匿名内部类
        Comparator<Double> comparator = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(3.14, 5.6));

        // Lambda表达式
        Comparator<Double> comparator2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator2.compare(3.14, 5.6));

        // 特殊方法引用
        Comparator<Double> comparator3 = Double::compareTo;
        System.out.println(comparator3.compare(3.14, 5.6));
    }
}
