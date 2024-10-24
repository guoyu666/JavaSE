package 继承012.Example08;

/**
 * 1.重要结论：一个非抽象类继承抽象类，必须将抽象类中的抽象方法实现了，这是java语法上强行规定的，必须的，不然编译器就报错了
 * 2.另一种是在子类中保留抽象类中的部分或者所有抽象方法仍未定义，这样就必须将子类也标记为抽象类
 * 3.面试判断题：java语言中凡事没有方法体的方法都是抽象方法？
 *              --错误，Object类中就有很多方法没有方法体，都是以“”结尾的，但他们都不是抽象方法，例如：public native int hashCode()
 *              这个方法底层调用了C++写的动态链接库程序，前面修饰符列表中没有abstract，有一个native，表示调用JVM本地程序
 */
public class AbstractTest02 {
    public static void main(String[] args)
    {
        Animal a = new Bird();
        a.move();

        Animal b = new Cat();
        b.move();
        //分析：1.编译的时候这个move方法是谁的？
        //     2.运行的时候这个move方法又是谁的？

    }
}

abstract class Animal
{
    public abstract void move();
}

class Bird extends Animal
{
    public void move() {
        System.out.println("鸟儿在飞翔！！");
    }
}

class Cat extends Animal
{
    public void move(){
        System.out.println("猫在走猫步！！");
    }
}
