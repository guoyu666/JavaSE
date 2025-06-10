package 类和对象05.inherit继承.Example01;

public class Account {
    private String actnum;
    private double balance;

    //默认构造函数
    public Account() {

    }

    //构造函数
    public Account(String actnum, double balance) {
        this.actnum = actnum;
        this.balance = balance;
    }

    public String getActnum() {
        return actnum;
    }

    public void setActnum(String actnum) {
        this.actnum = actnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
