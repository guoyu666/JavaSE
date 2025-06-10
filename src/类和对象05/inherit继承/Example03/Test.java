package 类和对象05.inherit继承.Example03;

/**
 * 关于Java语言中的多态语法机制：
 * 1.Animal和Cat之间存在继承饿关系，Animal是父类，Cat 是子类
 * 2.Cat is an Animal
 * 3.new Cat()创建的对象类型是Cat，a2这个引用数据类型是Animal，可见它们进行了类型转换，子类型转换成了父类型，称为向上转换，或者称为自动类型转换
 * 4.Java中允许这种语法，父类型引用指向了子类型对象
 */
public class Test {
    public static void main(String[] args)
    {
        Animals a1 = new Animals();
        a1.move();

        Cat c1 = new Cat();
        c1.move();
        c1.catchMouse();

        Bird b1 = new Bird();
        b1.move();

        /*
          1.Java程序永远都分为编译阶段和运行阶段
          2.先分析编译阶段，再分析运行阶段，编译无法通过，根本无法运行
          3.编译阶段编译器检查a2这个引用的数据类型为Animal，由于Animal.class字节码当中有move方法，所以编译通过了。这个过程我们称为静态绑定，
          编译阶段绑定
          4.在程序运行阶段，JVM堆内存当中真实创建的对象是Cat对象，那么以下程序在运行阶段一定会调用Cat对象的move方法，此时发生了程序的动态绑定，运行阶段绑定
          5.父类型引用指向子类行对象这种机制导致程序存在 编译阶段绑定和运行阶段绑定两种不同的形态/状态，这种机制可以成为一种多态语法机制
         */
        Animals a2 =  new Cat();
        a2.move();

        //a2.catchMouse();
        /*
        假设想让以上的对象执行catchMouse（）方法怎么办？
        --a2是无法直接调用的，因为a2的类型为Animal，Animal中没有catchMouse（）方法。
        我们可以将a2强制类型转换为Cat类型，a2的类型是Animal（父类），转换成Cat类型（子类）

        注意：向下转型也需要两种类型之间必须有继承关系，不然编译器会报错。强制类型转换需要加强制类型转换符。

        什么时候需要使用向下转型？--当调用的方法是子类中特有的，在父类型当中不存在，必须进行向下转型
         */
        Cat c2 = (Cat) a2;
        c2.catchMouse();

        Animals a3 = new Bird();

        /*
        1.程序虽然编译是没有问题的，因为编译器检查到a3的数据类型是Animal，Animal和Cat之间 存在继承关系，并且Animal是父类型，Cat是子类型，父类型转化为
        子类型叫做向下转型，语法合格。

        2.程序虽然编译通过了，但是程序运行阶段会出现异常，因为JVM堆内存区当中真实存在的对象是Bird类型，Bird类型无法转换成 Cat对象，因为两种类型之间不存在任何继承关系
        所以会出现著名的异常：java.lang.ClassCastException,这种异常总是在“向下转型”会发生

        3.instanceof运算符怎么使用？
        -- （1).语法格式：（引用 instanceof 数据类型名）
           （2).以上运算符的执行结果类型是布尔类型，结果可能是true/false
           （3).关于运算结果true/false：
                假设（a instanceof Animal）
                true表示：
                        a这个引用指向的对象是一个Animal类型
                false表示：
                        a这个引用指向的对象不是一个Animal类型

         4.Java规范中的要求：在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免ClassCastException异常的发生
         // Cat c3 = (Cat) a3;
         */
        if(a3 instanceof Cat)
        {
            Cat c3 = (Cat) a3;
            c3.catchMouse();        //调用之类对象中特有的方法
        }
        else if (a3 instanceof Bird)
        {
            Bird b2 = (Bird) a3;    //调用子类对象中特有的方法
            b2.fly();
        }
    }
}
