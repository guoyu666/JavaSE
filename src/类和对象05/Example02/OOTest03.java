package 类和对象05.Example02;

public class OOTest03 {
    public static void main(String[] args)
    {
        //创建一个丈夫对象
        //创建 一个妻子对象
        //结婚（能通过丈夫找到妻子，也能够通过妻子找到丈夫）
        Wife baby = new Wife();
        Husband HuangXiaoMing = new Husband();
        HuangXiaoMing.name = "黄晓明";
        baby.name = "baby";

        HuangXiaoMing.wife = baby;
        baby.husband = HuangXiaoMing;

        System.out.println(HuangXiaoMing.wife.name);
        System.out.println(baby.husband.name);
    }
}
