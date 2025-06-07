package 类和对象05.OOP03;

/**
 * 面试题：分析一下程序输出结果
 */
public class ArgsTest02 {
    public static void main(String[] args) {
        // 这里的u实际上保存了两个地址：（1）变量里面保存的地址 （2）变量本身在局部变量表里面占的内存地址
        User u = new User();
        u.age = 10;
        // u是怎么传递过去的？实际上与之前传递i的原理相同，都是将变量中保存中的值传递过去
        // 只不过这里的u变量中保存中保存的值比较特殊，是一个对象的内存地址
        add(u);
        System.out.println("main-->" + u.age); // 11
    }

    public static void add(User u){
        u.age++;
        System.out.println("add-->" + u.age); // 11
    }
}
