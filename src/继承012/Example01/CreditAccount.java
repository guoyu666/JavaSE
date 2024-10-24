package 继承012.Example01;

public class CreditAccount extends Account {

    private double credit;

    //构造函数，由于子类的构造函数不能直接的访问父类的私有字段，所以必须通过构造函数来初始化父类的这些私有字段
    public CreditAccount(String actnum, double balance) {
        super(actnum, balance);
    }

    //默认构造函数
    public CreditAccount() {
        super();
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
