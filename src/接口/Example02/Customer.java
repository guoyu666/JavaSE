package 接口.Example02;

/**
 * 顾客手里有一个菜单，记住：以后凡是满足has a的表示都以属性的形式存在
 */
public class Customer {
    //面向接口编程，面向抽象编程，降低程序的耦合度，提高程序的扩展力
    //接口的使用离不开多态机制（接口+多态才可以达到降低耦合度的目的）
    private FoodMenu foodMenu;

    //默认构造方法
    public Customer(){

    }

    //构造方法
    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //提供一个点菜的方法
    //先拿到菜单才能点菜
    //方法1:调用get方法拿菜单：FoodMenu fm = this.getFoodMenu();
    //方法2:也可以不用调用get方法，因为在本类中私有的属性是可以访问的
    public void order(){
        foodMenu.ShiZiChaoJiDan();
        foodMenu.YuXiangRouSi();
    }
}
