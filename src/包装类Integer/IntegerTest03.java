package 包装类Integer;

/*
关于Integer类的构造方法，有两个：
    Integer(int)
    Integer(String)
 */
public class IntegerTest03 {
    public static void main(String[] args) {
        //java9之后不建议使用这个构造方法了，出现红线表示已经过时
        //将数字100转化成Integer包装类型（int-->Integer）
        Integer x = new Integer(100);
        System.out.println(x);

        //将Strin类型的数字，转换成Integer包装类型（String-->Integer）
        Integer y = new Integer("123");
        System.out.println(y);

        //double - > Double
        Double d = new Double(1.23);
        System.out.println(d);

        //String - > Double
        Double e = new Double("3.14");
        System.out.println(e);
    }
}
