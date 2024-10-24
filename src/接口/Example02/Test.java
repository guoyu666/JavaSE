package 接口.Example02;

/**
 * 1.任何一个接口都有调用者和实现者，接口可以将调用者和实现者解耦合。
 * 调用者面向接口调用，实现者面向接口编写实现
 *
 * 2.抽象类和接口的区别：
 *      （1）抽象类是半抽象的，接口是完全抽象的
 *      （2）抽象类中有构造方法，接口中没有构造方法
 *      （3）接口和接口之间支持多继承，类和类之间 只能单独继承
 *      （4）一个类可以同时实现多个接口，一个抽象类只能继承一个类（单继承）
 */
public class Test {
    public static void main(String[] args){
        //创建厨师对象
        FoodMenu cook1 = new ChinaCook();

        //创建顾客对象
        Customer customer = new Customer(cook1);

        //顾客点菜
        customer.order();
    }
}
