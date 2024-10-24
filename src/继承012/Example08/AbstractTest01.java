package 继承012.Example08;

/**
 * 抽象类：
 *  1.什么是抽象类？抽象类是类和类之间的共有特征，将这些具有共有特征的类再进一步抽象形成了抽象类，由于类本身是不存在的，所以抽象类无法创建对象
 *  2.类到对象是实例化，对象到类是抽象
 *  3.抽象类属于什么类型？抽象类也属于引用数据类型
 *  4.抽象类怎么定义？【修饰符列表】abstract class 类名
 *  5.final和abstract不能联合使用，这两个关键字是对立的
 *  6.抽象类的子类也可以是抽象类，也可以是非抽象类
 *  7.抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的
 *  8.抽象方法表示没有实现的方法，没有方法体的方法
 *  9.抽象类中不一定有抽象方法，但是抽象方法必须出现在抽象类中
 *
 */
public class AbstractTest01 {
    public static void main(String[] args)
    {

    }
}

//银行帐户类
abstract  class Account
{
    //默认无参构造函数
    public Account()
    {

    }

    //有参构造函数
    public Account(String s)
    {

    }
}

//子类继承抽象类
class CreditAccount extends Account
{

}
