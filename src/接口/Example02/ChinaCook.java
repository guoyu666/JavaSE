package 接口.Example02;

/**
 * 中餐厨师，实现菜单上的类
 */
public class ChinaCook implements FoodMenu {
    @Override
    public void ShiZiChaoJiDan() {
        System.out.println("中餐师傅做的西红柿炒鸡蛋，东北口味！！");
    }

    @Override
    public void YuXiangRouSi() {
        System.out.println("中餐师傅做的鱼香肉丝，川式麻辣口味！！");
    }
}
