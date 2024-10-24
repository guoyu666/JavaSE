package 多线程.threadsafe3;

public class Account {
    // 账号
    private String actno;
    // 余额
    private double balance;

    //无参数构造函数
    public Account() {
    }

    //有参数构造函数
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款的方法
    /*在实例方法上可以使用synchronized吗？可以的。
        --synchronized出现在实例方法上 ，一定锁的是this。没得挑，只能是this，不能是其他的对象了。
        所以这种方式不灵活。

        --另外还有一个缺点：synchronized出现在实例方法上，表示整个方法体都需要同步，可能会无故扩大同步的范围，导致程序的执行效率较低，所以这种方式不常用。

        --优点：代码写得少，简洁了。如果共享的对象就是this，并且需要同步的代码块是整个方法体，建议使用这种方式。
     */
    public synchronized void withdraw(double money) {
            double before = this.getBalance(); // 10000
            // 取款之后的余额
            double after = before - money;

            // 在这里模拟一下网络延迟，100%会出现问题
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 更新余额
            this.setBalance(after);
        }
    }