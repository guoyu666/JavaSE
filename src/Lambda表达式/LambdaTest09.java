package Lambda表达式;

import java.util.function.Supplier;

/**
 * 实例方法引用：语法格式：
 * 对象::实例方法名
 * 满足什么条件的时候可以使用实例方法引用？
 *      函数式接口中的  返回值类型 和  形参
 *      与
 *      内部调用的方法的 返回值类型 和 形参
 *      一致
 */
public class LambdaTest09 {
    public static void main(String[] args) {
        // 使用生产型接口：Supplier
        // 匿名内部类的方式
        Teacher teacher = new Teacher("GuoYu");
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return teacher.getName();
            }
        };
        System.out.println(supplier.get());

        // 以上是否符合“实例方法引用”的条件
        // 先修改为Lambda表达式
        Supplier<String> supplier1 = () -> teacher.getName();
        System.out.println(supplier1.get());

        // 使用“实例方法引用”精简
        Supplier<String> supplier2 = teacher::getName;
        System.out.println(supplier2.get());
    }
}

class Teacher {
    private String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;
    }
}


