package 类和对象05.OOP08;

/**
 * 需求:定义一个日期类，代表日期。日期属性包括：年月日
 * 提供两个构造方法:
 *      一个是无参数构造方法，当通过无参数构造方法实例化日期对象的时候，默认创建的日期是：1970-01-01
 *      另一个构造方法三个参数，通过传递年月日三个参数来确定一个日期，注意属性要提供封装
 */
public class Date {

    // 年
    private int year;
    // 月
    private int month;
    // 日
    private int day;

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

    public Date() {
        // 构造方法之间的调用
        // 这样不会创建新对象，只是通过一个构造方法调用另一个构造方法
        this(1970, 1, 1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * 打印日期
     */
    public void display() {
        System.out.println(this.year + "年" + this.month + "月" + this.day + "月");
    }
}
