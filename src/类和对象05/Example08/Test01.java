package 类和对象05.Example08;

public class Test01 {
    public static void main(String[] args) {
        int i = 10;
        add(i);
        System.out.println("main-->" + i);
    }

    public static void add(int i) {
        i++;
        System.out.println("add-->" + i);
    }
}
