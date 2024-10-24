package 类和对象09.Example03;

public class OOTest04 {
    public static void main(String[] args)
    {
        Customer c  = new Customer();
        System.out.println(c.id);
        c = null;       //空指针访问“实例”相关的数据一定会出现空指针异常的现象。
                        //“实例”相关的数据标识：这个数据访问的时候必须有对象的参与
    }
}
