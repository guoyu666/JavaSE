package 类和对象05.Example09;

public class ThisTest02 {
    public static void main(String[] args)
    {
        User U1 = new User(100, "郭雨 ");
        System.out.println(U1.getId());
        System.out.println(U1.getName());

        U1.setName("lisi");
        System.out.println(U1.getName());
    }
}
