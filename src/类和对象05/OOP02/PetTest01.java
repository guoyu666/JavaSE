package 类和对象05.OOP02;

public class PetTest01 {
    public static void main(String[] args) {
        // 创建宠物对象
        Pet dog = new Pet();
        dog.name = "小黑";
        dog.birthday = "2012-10-11";
        dog.sex = '雄';

        // 读取属性的值
        System.out.println(dog.name);
        System.out.println(dog.birthday);
        System.out.println(dog.sex);

        dog.eat();
        dog.run();

        // 注意：引用一旦为null，表示引用不再指向对象了。但是通过引用访问name属性，编译可以通过
        // 运行时会出现异常，空指针异常：NullPointerException,这是一个非常著名的异常
        // 为什么会出现空指针异常？因为运行的时候会找出真正的对象，如果对象不存在了，就会出现这个异常
        dog = null;
        System.out.println(dog.name);
    }
}
