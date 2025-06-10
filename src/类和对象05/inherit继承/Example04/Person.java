package 类和对象05.inherit继承.Example04;

public class Person {

    //Person主人类面向的是一个抽象的Pet，而不再面向具体的宠物，提倡：面向抽象编程，不要面向具体编程
    //抽象编程的好处：耦合度低，扩展力强
    public void feed(Pet p)
    {
        p.eat();
    }
}
