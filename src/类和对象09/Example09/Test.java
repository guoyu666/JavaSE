package 类和对象09.Example09;

public class Test {
    public static void main(String[] args)
    {
        Test.doSome();
        doSome();

        Test t  =new Test();
        t.doSome();
        /**
         * 带有static的方法，其实既可以采用类名的方式访问 ，也可以采用引用的方式访问，但即使采用引用的方式去访问，实际上执行的时候和引用指向的
        对象无关
         */
    }


    //带有static的方法，需要使用 “类名.”的方式访问
    public static void doSome()
    {
        System.out.println("doSome!");
    }
}
