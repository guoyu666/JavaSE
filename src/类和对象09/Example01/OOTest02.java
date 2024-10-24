package 类和对象09.Example01;

public class OOTest02 {
    public static void main(String[] agrs) {
        /*
            在Java中，任何对象变量的值都是一个引用，指向存储在另外一个地方的某个对象，new操作符的返回值也是一个引用
         */
        User U = new User();
        Address a = new Address();
        U.addr = a;
        a.city = "成都";

        System.out.println(U.addr.city);


    }
}
