package Lambda表达式;

import java.util.function.Function;

/**
 构造方法引用
 *      语法格式：
 *          类名::new
 *      条件：
 *          函数式接口中的方法的形式参数列表
 *          与
 *          构造方法上的形式参数列表一致
 *          并且返回值类型相同
 */
public class LambdaTest15 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        // 使用转化型的函数式接口
        Function<String, Person> function = new Function<String, Person>() {
            @Override
            public Person apply(String name) {
                return new Person(name);
            }
        };
        System.out.println(function.apply("GuoYu"));

        // Lambda表达式
        Function<String, Person> function1 = name -> new Person(name);
        System.out.println(function1.apply("GuoYu"));

        // 使用构造方法引用进行精简
        Function<String, Person> function2 = Person::new;
        System.out.println(function2.apply("GuoYu"));
    }
}

class Person{
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}
