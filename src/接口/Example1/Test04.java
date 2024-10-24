package 接口.Example1;

public class Test04 {
    public static void main(String[] args)
    {
        Flyable f1 = new Cat();  //多肽
        f1.fly();

        Flyable f2 = new Pig();
        f2.fly();

        Flyable f3 = new Fish();
        f3.fly();
    }
}

class Animal
{

}

interface Flyable{
    void fly();
}

//动物类子类：猫类
class Cat extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞猫起飞 ！！");
    }
}

class Snake extends Animal{

}

class Pig extends Animal implements Flyable{

    @Override
    public void fly() {
        System.out.println("站在风口上，猪也会飞！！");
    }
}

class Fish implements Flyable{      //虽然没有写extends，也是有的，默认继承Objects

    @Override
    public void fly() {
        System.out.println("鱼不会飞！！");
    }
}
