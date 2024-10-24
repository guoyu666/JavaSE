package 接口.Example1;

/**
 * 接口的基础语法：
 *      1.类和类之间叫做继承，类和接口之间叫做实现。继承使用extends关键字完成，实现使用implements关键字完成
 *      别多想：你仍然可以将“实现”看做“继承”
 *
 *      2.当一个非抽象类实现接口的话，必须将接口中所有的抽象方法必须全部实现（覆盖，重写）
 *
 */

public class Test02 {
    public static void main(String[] args)
    {
        //父类型的引用指向子类行的对象
        Math mm  = new MyMathImpl();
        //调用接口里面的方法（面向接口编程）
        int result1 = mm.sum(3,5);
        System.out.println(result1);

        int result2 = mm.sub(56,35);
        System.out.println(result2);
    }
}

//特殊的抽象类，完全抽象，叫做接口
interface Math
{
    double PI = 3.1415926;
    int sum(int a, int b);
    int sub(int a, int b);
}


//编写一个类（这个类是一个“非抽象”的类）
class MyMathImpl implements Math {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
