package 类和对象09.Example01;

public class OOTest01 {
    public static void main(String[] args)
    {
        User U = new User();

        System.out.println(U.num);
        System.out.println(U.name);
        System.out.println(U.addr);

        System.out.println(">--------------<");
        //修改User对象内部实例变量的值
        U.num = 101;
        U.name = "GuoYu";
        U.addr = new Address();

        U.addr.city = "成都";
        U.addr.street = "高新区郫都街道";
        U.addr.zipcode = "1314";

        System.out.println(U.name);
        System.out.println(U.num);
        System.out.println(U.addr.city);
        System.out.println(U.addr.street);
        System.out.println(U.addr.zipcode);
    }
}
