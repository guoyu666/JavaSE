package 类和对象05.OOP02;

/**
 * 宠物类
 */
public class Pet {
    // 名字
    String name;

    // 出身日期
    String birthday;

    // 性别
    char sex;

    // 吃
    public void eat() {
        System.out.println("在吃东西");
    }

    // 跑
    public void run() {
        System.out.println("在跑步");
    }
}
