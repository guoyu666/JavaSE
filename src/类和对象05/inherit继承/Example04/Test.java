package 类和对象05.inherit继承.Example04;

public class Test {
    public static void main(String[] args)
    {
        //创建主人对象
        Person p = new Person();

        //创建猫对象
        Cat tom = new Cat();

        //创建狗对象
        Dog d = new Dog();

        //主人喂养猫和狗
        p.feed(tom);
        p.feed(d);
    }
}
