package 类和对象09.Example09;

/**
 * 最终结论：
 *          在带有static的方法中不能“直接”访问实例变量和实例方法。
 *          因为实例变量和实例方法都需要对象的存在，而static的方法中是没有this的，
 *          也就是说当前对象不存在，自然也就无法访问当前
 *          对象的实例变量和实例方法
 */
public class ThisTest01 {
    public static void main(String[] args)
    {
        //调用doSome方法
        ThisTest01.doSome();

        //调用doOther方法
        /*
            直接使用doOther()方法会报错，这是因为doOther是实例方法，实例方法调用必须有对象的存在，这个代码表示调用当前对象的doOther方法，
            但是由于main方法中没有this，所以这个方法不能够被调用
         */
        ThisTest01 T= new ThisTest01();
        T.doOther();
        T.run();
    }

    public static void doSome()
    {
        System.out.println("do Some!");
    }


    //实例方法
    public void doOther()
    {
        System.out.println("do Other!");
    }

    //实例方法
    public void run()
    {
        /*
        在大括号中的代码执行过程中一定是存在“当前对象”的，也就是说这里一定有“this”的
         */
        System.out.println("run execute!");
        /*
        doOther是一个实例方法，实例方法调用必须有对象的存在，以下代码表示的就是：调用当前对象的doOther方法
         */
        this.doOther(); //比较完整的写法
    }
}
