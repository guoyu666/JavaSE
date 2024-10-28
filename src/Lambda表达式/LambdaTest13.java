package Lambda表达式;

import java.util.function.Function;

/**
 * 特殊方法引用
 *      语法格式：
 *          类名::实例方法
 *      条件：
 *          1.函数式接口中抽象方法的第一个参数作为内部方法调用对象
 *          2.从函数式接口的抽象方法的第二个参数开始 与 内部调用方法时的参数类型 一致
 *          3.函数式接口中的抽象方法返回值类型 与 内部方法返回值类型 一致
 */
public class LambdaTest13 {
    public static void main(String[] args) {
        // 转换型函数式接口
        // 匿名内部类
        Vip vip = new Vip("GuoYu");
        Function<Vip, String> function = new Function<Vip, String>() {
            @Override
            public String apply(Vip vip) {
                return vip.getName();
            }
        };

        System.out.println(function.apply(vip));

        // Lambda表达式
        Function<Vip, String> function1 = vip1 -> vip1.getName();
        System.out.println(function1.apply(vip));

        // 特殊方法引用
        Function<Vip, String> function2 = Vip::getName;
        System.out.println(function2.apply(vip));
    }

}

class Vip{
    private String name;

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vip(String name) {
        this.name = name;
    }
}
