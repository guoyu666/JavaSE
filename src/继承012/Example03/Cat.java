package 继承012.Example03;

public class Cat extends Animals {

    //重写父类中的方法
    public void move() {
        System.out.println("猫在移动！！");
    }

    //不是从父类中继承过来的方法。这个方法是子类特有的行为
    public void catchMouse()
    {
        System.out.println("猫抓老鼠！！");
    }
}
