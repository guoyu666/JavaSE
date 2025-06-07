package 类和对象05.Example09;

/**
 * this可以调用在哪里？
 * 1.可以使用在实例方法中，代表当前对象【语法格式：this.】
 * 2.可以使用在构造方法中，通过当前的构造方法调用其他的构造方法【语法格式：this(实参)】
 */
public class Date {
    //属性
    private int year;
    private int month;
    private int day;

    /**
     * 需求：当程序员调用以下无参数的构造方法的时候，默认创建的日期是1997-1-1
     */
    //构造函数
    public Date()
    {
        /*
        this.year = 1997;
        this.month = 1;
        this.day = 1;
        */
        this(1997,1,1);     //这种方式不会创建新的java对象，但同时又可以达到调用其他的构造方法
    }

    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //对外提供一个方法可以将日期打印输出到控制台
    //实例方法
    public void print()
    {
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }

}
