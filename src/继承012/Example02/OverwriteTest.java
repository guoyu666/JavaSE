package 继承012.Example02;

/**
 * 回顾Java语言当中方法的重载：
 * 1.方法重载又称为：Overload
 * 2.方法重载什么时候使用？-- 当在同一个类中，方法完成的功能是相似的，建议方法名相同，这样方便程序员的编程，就像在调用一个方法似的，代码美观
 * 3.什么条件满足之后构成方法的重载？-- 在同一个类当中，方法名相同，参数列表不同：类型，顺序，个数
 * 4.方法重载和什么 无关？-- 和方法的返回值类型无关，和方法的修饰符列表无关
 *
 * Java语言当中的方法的覆盖：
 * 1.方法覆盖又被称为方法重写（Overwrite）
 * 2.什么时候使用方法重写？-- 当父类的方法已经无法满足当前子类的业务需求，子类有必要将父类中继承过来的方法进行重新编写，这个重新编写的过程就是方法重写
 * 3.什么条件满足之后方法会发生重写呢？-- 方法重写发生在具有继承关系的父子类之间，返回值类型相同，方法名相同，形参列表相同
 * 4.注意：
 *       （1）.私有方法不能继承，所以不能覆盖
 *       （2）.构造方法不能继承，所以不能覆盖
 *       （3）.静态方法不存在覆盖
 *       （4）.覆盖只针对方法，不谈属性
 */
public class OverwriteTest {
    public static void main(String[] args)
    {
        Animal a = new Animal();
        a.move();

        Cat C = new Cat();
        C.move();
    }
}
