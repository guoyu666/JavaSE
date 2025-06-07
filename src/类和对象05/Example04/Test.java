package 类和对象05.Example04;

public class Test {
    public static void main(String[] args)
    {
        Person GuoYu = new Person();
        GuoYu.name = "郭雨";
        GuoYu.id = "1314";
        GuoYu.age = 26;
        GuoYu.sex =  true;

        House FangZi = new House();
        FangZi.HuZhu = GuoYu;
        FangZi.MianJi = 500;

        System.out.println(FangZi.HuZhu.name);
    }
}
