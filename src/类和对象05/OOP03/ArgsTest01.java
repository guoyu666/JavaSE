package 类和对象05.OOP03;

/**
 * 判断该程序的输出结果
 */
public class ArgsTest01 {
    public static void main(String[] args) {
        int i = 10;
        add(i);
        System.out.println("main-->" + i); // 10
    }

    public static void add(int i) { // 方法的形参是局部变量
        i++;
        System.out.println("add-->" + i); // 11
    }
}
