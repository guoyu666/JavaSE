package 接口.Example1;

/**
 * 接口与接口之间支持多继承，那么一个类可以同时实现多个接口吗？
 *      --一个类可以同时实现多个接口，这种机制弥补了Java中的类和类只支持单继承带来的缺陷
 */
public class Test03 {
    public static void main(String[] args)
    {
        Aa a = new D();
        Bb b = new D();
        Cc c  =new D();

        //编译没问题，运行也没问题
        Bb b2 = (Bb) a;
        b2.m2();

        M m = new E();  //父类型的引用指向子类行的对象
        //K k = (K)m;     经过测试，接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转。但是一定要注意，运行时可能会出现ClassCastException异常

        if (m instanceof K)
        {
            K k = (K)m;
        }

    }
}

interface K{

}

interface M{

}

class E implements M{

}

//---------------------------------------------

interface Aa
{
    void m1();
}

interface Bb
{
    void m2();
}

interface Cc
{
    void m3();
}

//实现多个接口,其实就类似于多继承
class D implements Aa,Bb,Cc
{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {
        System.out.println("m2.....");
    }

    @Override
    public void m3() {

    }
}


