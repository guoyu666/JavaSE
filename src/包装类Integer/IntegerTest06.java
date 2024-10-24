package 包装类Integer;

public class IntegerTest06 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        /*
        java中为了提高程序的执行效率，将[-128,127]之间的所有的包装对象提前创建好，放到一个方法区的“整数型常量池”中，目的是只要用这个区间的数据不需要
        再new了，直接从整数型常量池中取出来
         */
        Integer c = 127;
        Integer d = 127;
        // ==永远判断的都是两个对象的内存地址是否相同
        System.out.println(c == d);
    }
}
