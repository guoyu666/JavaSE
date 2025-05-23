package 多线程.threadsafe2;

/*
银行账户
    使用线程同步机制，解决线程安全问题
 */
public class Account {
    // 账号
    private String actno;
    // 余额
    private double balance;
    //对象
    final Object obj = new Object();      //实例变量（Account对象是对线程共享的，Account对象中的实例变量obj也是共享的）

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
    public void withdraw(double money){
        //以下这几行代码必须是线程排队的，不能并发
        //一个线程把这里的代码全部执行结束之后，另一个线程才能进来
        /*
        线程同步机制的语法是：
            synchronized(){
                //线程同步代码块。
            }
            synchronized后面的小括号中传的这个“数据”是相当关键的，这个数据必须是多线程共享的数据，才能达到多线程排队

            小括号中写什么？
            --那要看你想让哪些线程同步。
                假设t1、t2、t3、t4、t5，有5个线程，
                你只希望t1 t2 t3排队，t4 t5不需要排队。怎么办？
                你一定要在()中写一个t1 t2 t3共享的对象。而这个
                对象对于t4 t5来说不是共享的。

            这里的共享对象是：账户对象。
            账户对象是共享的，那么this就是账户对象吧！！！
            不一定是this，这里只要是多线程共享的那个对象就行。

            在java语言中，任何一个对象都有“一把锁”，其实这把锁就是标记。（只是把它叫做锁。）
            100个对象，100把锁。1个对象1把锁。

            以下代码的执行原理？
                1、假设t1和t2线程并发，开始执行以下代码的时候，肯定有一个先一个后。
                2、假设t1先执行了，遇到了synchronized，这个时候自动找“后面共享对象”的对象锁，
                找到之后，并占有这把锁，然后执行同步代码块中的程序，在程序执行过程中一直都是
                占有这把锁的。直到同步代码块代码结束，这个锁才会释放。
                3、假设t1已经占有这把锁，此时t2也遇到synchronized关键字，也会去占有后面
                共享对象的这把锁，结果这把锁被t1占有，t2只能在同步代码块外面等待t1的结束，
                直到t1把同步代码块执行结束了，t1会归还这把锁，此时t2终于等到这把锁，然后
                t2占有这把锁之后，进入同步代码块执行程序。

                这样就达到了线程排队执行。
                这里需要注意的是：这个共享对象一定要选好了。这个共享对象一定是你需要排队
                执行的这些线程对象所共享的。
         */
        //synchronized(this)
        //synchronized(obj)
        synchronized (obj){
            // 取款之前的余额
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
            // 思考：t1执行到这里了，但还没有来得及执行这行代码，t2线程进来withdraw方法了。此时一定出问题。
            this.setBalance(after);
        }

    }
}