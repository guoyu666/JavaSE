package Lambda表达式;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaTest01 {
    public static void main(String[] args) {
        // TreeSet集合中的元素是可以自动排序的
        // TreeSet集合是怎么排序的？两种方式
        // 第一种方式：如果比较的规则固定不变，可以让TreeSet中的集合元素实现java.long.Comparable接口
        // 第二种方式：创建TreeSet集合的时候，给TreeSet集合传递一个比较器对象：比较器实现java.util.Comparator接口
        // 以下是匿名内部类的方式
        TreeSet<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        User user1 = new User(20);
        User user2 = new User(30);
        users.add(user1);
        users.add(user2);
        System.out.println(users);
    }
}

class User {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
