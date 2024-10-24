package 类和对象09.Example07;

public class ConstructorTest02 {
    public static void main(String[] args) {
        Account act1 = new Account();

        act1.setActnum("111");

        System.out.println(act1.getActnum());
        System.out.println(act1.getBalance());
    }
}
