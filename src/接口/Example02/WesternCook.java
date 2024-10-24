package 接口.Example02;

/**
 * 西餐厨师，实现菜单上的类
 */
public class WesternCook implements FoodMenu {
    @Override
    public void ShiZiChaoJiDan() {
        System.out.println("西式西红柿炒鸡蛋！！");
    }

    @Override
    public void YuXiangRouSi() {
        System.out.println("西式鱼香肉丝！！");
    }
}
