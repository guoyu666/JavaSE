package 接口.Example05;

/**
 * 匿名内部类：
 * 1.什么是内部类？
 * 内部类：在类的内部定义了一个新的类，被称为内部类
 * <p>
 * 2.内部类的分类？
 * 静态内部类：类似于静态变量
 * 实例内部类：类似于实例变量
 * 局部内部类：类似于局部变量
 * <p>
 * 3.使用内部类编写的代码，可读性很差，能不用尽量不用
 * 4.匿名内部类是局部内部类的一种，因为 这个类没有名字，叫做匿名内部类
 * 5.学习匿名内部类主要是为了让大家以后在阅读别人代码的时候，能够理解，并不代表以后都要这样写，因为匿名内部类有两个缺点：1.太复杂，可读性差 2.类没有名字，以后想重复使用，不能用
 */
public class Test01 {
    //该类在类的内部，所以称为内部类
    //由于前面有static。所以称为“静态内部类”
    static class Inner1 {
    }

    //该类在类的内部，所以称为内部类
    //没有static叫做实例内部类
    class Inner2 {
    }

    public void doSome() {
        //该类在类的内部，所以称为内部类
        //局部内部类
        class Inner3 {
        }
    }

    public void doOther() {
        //doSome()方法中的局部内部类Inner3，在doOther()中不能用
    }

    //main方法入口
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        /*
        Compute c = new ComputeImpl();
        mm.mySum(c, 100,1200);
        */

        //合并上述代码
        //方法1:mm.mySum(new ComputeImpl(), 100,1100);

        //方法2:使用匿名内部类,表示这个ComputeImpl这个类没名字了
        //这里表面看上去好像是接口可以直接new了，实际上并不是接口可以直接new了，后面的{}代表了对接口的实现
        //不建议使用匿名内部类，因为一个类没有名字，没有办法重复使用，另外代码太乱，可读性太差
        mm.mySum(new Compute() {
            public int sum(int a, int b) {
                return a + b;
            }
        }, 100, 100);
    }
}

//负责计算的接口
interface Compute {
    int sum(int a, int b);
}

//你自动会在这里编写一个Compute接口的实现类
/*
class ComputeImpl implements Compute{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
 */

class MyMath {
    public void mySum(Compute c, int x, int y) {
        int retValue = c.sum(x, y);
        System.out.println(x + "+" + y + "=" + retValue);
    }
}
