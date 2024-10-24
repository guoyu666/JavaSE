package 类和对象09.Example09;

public class Customer {
    String name;

    //构造函数
    public Customer()
    {

    }

    public void Shopping()
    {
        System.out.println(name + "在购物！！");     //完整写法：System.out.println(this.name + "在购物！！");
    }

    public static void doSome()
    {
        System.out.println("Static!");
        /*
            System.out.println(name)会报错，这是因为doSome方法调用不是对象去调用，是一个类名去调用，执行过程中没有“当前对象”，
            而name是一个“实例变量”，需要通过对象访问
         */
    }
}
