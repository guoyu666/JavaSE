package reflect.Reflection;

class MyClass{
    //静态代码块执在类加载的时候执行，并且只执行一次
    static {
        System.out.println("MyClass类的静态代码块执行！");
    }
}
