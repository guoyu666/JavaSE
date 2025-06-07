package 类和对象05.Example07;

public class Account {
    //账号
    private String actnum;

    //余额
    private double balance;

    //类似于C++中的默认构造函数
    public Account()
    {
        System.out.println("调用了默认构造函数！！");
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
