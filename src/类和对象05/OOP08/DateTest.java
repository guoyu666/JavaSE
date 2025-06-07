package 类和对象05.OOP08;

public class DateTest {
    public static void main(String[] args) {
        // 创建日期对象
        Date d1 = new Date();
        d1.display();

        // 创建指定的日期
        Date d2 = new Date(2008, 8, 8);
        d2.display();

    }
}
