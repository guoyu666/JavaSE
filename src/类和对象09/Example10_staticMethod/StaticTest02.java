package 类和对象09.Example10_staticMethod;

/**
 * 1.方法什么时候？--方法描述的是动作，当所有的对象执行这个动作的时候，最终产生的结果影响是一样的，那么这个动作已经不再属于某一个对象动作了，
 * 可以将这个动作提升为类级别的动作，模版级别的动作。
 * 2.静态方法中无法直接访问实例变量和实例方法
 * 3.大多数方法都定义为实例方法
 *
 */

public class StaticTest02 {

    //实例变量
    int i = 100;

    //实例方法
    public void doSome()
    {
        System.out.println("doSome!!");
    }

    public static void main(String[] args)
    {
        StaticTest02  st = new StaticTest02();
        System.out.println(st.i);
        st.doSome();
    }
}
