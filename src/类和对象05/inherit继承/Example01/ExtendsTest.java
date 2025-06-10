package 类和对象05.inherit继承.Example01;

public class ExtendsTest {
    public static void main(String[] args)
    {
        ExtendsTest ex = new ExtendsTest();
        String s = ex.toString();   //这里编译通过了,说明可以调用toString方法，ExtendTest类中有toString方法，从Object类中继承过来
        System.out.println(s);

        CreditAccount act = new CreditAccount();
        act.setActnum("act-001");
        act.setBalance(-1000);
        act.setCredit(0.99);

        System.out.println(act.getActnum() + "," + act.getBalance() + "," +  act.getCredit());
    }
}
