package 类和对象09.Example10_staticMethod;

public class ChineseTest {
    public static void main(String[] args)
    {
        Chinese C1 = new Chinese("1", "GuoYu");
        System.out.println(C1.id + ", " + C1.name + ", " + Chinese.country);

        Chinese C2 = new Chinese("2", "LuoYiYan");
        System.out.println(C2.id + ", " + C2.name + ", " + Chinese.country);
    }
}
